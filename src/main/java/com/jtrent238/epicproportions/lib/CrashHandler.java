package com.jtrent238.epicproportions.lib;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;


public class CrashHandler {

	private File crashReportFile;
	private final String description;
    private final Throwable cause;
    private StackTraceElement[] stacktrace = new StackTraceElement[0];
    private final List crashReportSections = new ArrayList();
	private CrashReport crashreport;
    private final CrashReportCategory theReportCategory = new CrashReportCategory(crashreport, "System Details");
    private static final Logger logger = LogManager.getLogger();
    
    public CrashHandler(String p_i1348_1_, Throwable p_i1348_2_)
    {
        this.description = p_i1348_1_;
        this.cause = p_i1348_2_;
        //this.populateEnvironment();
    }
    
	/**
     * Gets the file this crash report is saved into.
     */
    @SideOnly(Side.CLIENT)
    public File getFile()
    {
        return this.crashReportFile;
    }

    /**
     * Returns the description of the Crash Report.
     */
    public String getDescription()
    {
        return this.description;
    }
    
    /**
     * Gets the complete report with headers, stack trace, and different sections as a string.
     */
    public String getCompleteReport()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("---- Minecraft Crash Report ----\n");
        stringbuilder.append("// ");
        stringbuilder.append(getWittyComment());
        stringbuilder.append("\n\n");
        stringbuilder.append("Time: ");
        stringbuilder.append((new SimpleDateFormat()).format(new Date()));
        stringbuilder.append("\n");
        stringbuilder.append("Description: ");
        stringbuilder.append(this.description);
        stringbuilder.append("\n\n");
        stringbuilder.append(this.getCauseStackTraceOrString());
        stringbuilder.append("\n\nA detailed walkthrough of the error, its code path and all known details is as follows:\n");

        for (int i = 0; i < 87; ++i)
        {
            stringbuilder.append("-");
        }

        stringbuilder.append("\n\n");
        this.getSectionsInStringBuilder(stringbuilder);
        return stringbuilder.toString();
    }
    
    /**
     * Gets the various sections of the crash report into the given StringBuilder
     */
    public void getSectionsInStringBuilder(StringBuilder p_71506_1_)
    {
        if ((this.stacktrace == null || this.stacktrace.length <= 0) && this.crashReportSections.size() > 0)
        {
            this.stacktrace = (StackTraceElement[])ArrayUtils.subarray(((CrashReportCategory)this.crashReportSections.get(0)).func_147152_a(), 0, 1);
        }

        if (this.stacktrace != null && this.stacktrace.length > 0)
        {
            p_71506_1_.append("-- Head --\n");
            p_71506_1_.append("Stacktrace:\n");
            StackTraceElement[] astacktraceelement = this.stacktrace;
            int i = astacktraceelement.length;

            for (int j = 0; j < i; ++j)
            {
                StackTraceElement stacktraceelement = astacktraceelement[j];
                p_71506_1_.append("\t").append("at ").append(stacktraceelement.toString());
                p_71506_1_.append("\n");
            }

            p_71506_1_.append("\n");
        }

        Iterator iterator = this.crashReportSections.iterator();

        while (iterator.hasNext())
        {
            CrashReportCategory crashreportcategory = (CrashReportCategory)iterator.next();
            crashreportcategory.appendToStringBuilder(p_71506_1_);
            p_71506_1_.append("\n\n");
        }

        this.theReportCategory.appendToStringBuilder(p_71506_1_);
    }

    
    /**
     * Gets a random witty comment for inclusion in this CrashReport
     */
    private static String getWittyComment()
    {
        String[] astring = new String[] {"Who set us up the TNT?", "Everything\'s going to plan. No, really, that was supposed to happen.", "Uh... Did I do that?", "Oops.", "Why did you do that?", "I feel sad now :(", "My bad.", "I\'m sorry, Dave.", "I let you down. Sorry :(", "On the bright side, I bought you a teddy bear!", "Daisy, daisy...", "Oh - I know what I did wrong!", "Hey, that tickles! Hehehe!", "I blame Dinnerbone.", "You should try our sister game, Minceraft!", "Don\'t be sad. I\'ll do better next time, I promise!", "Don\'t be sad, have a hug! <3", "I just don\'t know what went wrong :(", "Shall we play a game?", "Quite honestly, I wouldn\'t worry myself about that.", "I bet Cylons wouldn\'t have this problem.", "Sorry :(", "Surprise! Haha. Well, this is awkward.", "Would you like a cupcake?", "Hi. I\'m Minecraft, and I\'m a crashaholic.", "Ooh. Shiny.", "This doesn\'t make any sense!", "Why is it breaking :(", "Don\'t do that.", "Ouch. That hurt :(", "You\'re mean.", "This is a token for 1 free hug. Redeem at your nearest Mojangsta: [~~HUG~~]", "There are four lights!", "But it works on my machine."};

        try
        {
            return astring[(int)(System.nanoTime() % (long)astring.length)];
        }
        catch (Throwable throwable)
        {
            return "Witty comment unavailable :(";
        }
    }
    
    /**
     * Gets the stack trace of the Throwable that caused this crash report, or if that fails, the cause .toString().
     */
    public String getCauseStackTraceOrString()
    {
        StringWriter stringwriter = null;
        PrintWriter printwriter = null;
        Object object = this.cause;

        if (((Throwable)object).getMessage() == null)
        {
            if (object instanceof NullPointerException)
            {
                object = new NullPointerException(this.description);
            }
            else if (object instanceof StackOverflowError)
            {
                object = new StackOverflowError(this.description);
            }
            else if (object instanceof OutOfMemoryError)
            {
                object = new OutOfMemoryError(this.description);
            }

            ((Throwable)object).setStackTrace(this.cause.getStackTrace());
        }

        String s = ((Throwable)object).toString();

        try
        {
            stringwriter = new StringWriter();
            printwriter = new PrintWriter(stringwriter);
            ((Throwable)object).printStackTrace(printwriter);
            s = stringwriter.toString();
        }
        finally
        {
            IOUtils.closeQuietly(stringwriter);
            IOUtils.closeQuietly(printwriter);
        }

        return s;
    }

    
    /**
     * Saves this CrashReport to the given file and returns a value indicating whether we were successful at doing so.
     */
    public boolean saveToFile(File p_147149_1_)
    {
        if (this.crashReportFile != null)
        {
            return false;
        }
        else
        {
            if (p_147149_1_.getParentFile() != null)
            {
                p_147149_1_.getParentFile().mkdirs();
            }

            try
            {
                FileWriter filewriter = new FileWriter(p_147149_1_);
                filewriter.write(this.getCompleteReport());
                filewriter.close();
                this.crashReportFile = p_147149_1_;
                return true;
            }
            catch (Throwable throwable)
            {
                logger.error("Could not save crash report to " + p_147149_1_, throwable);
                return false;
            }
        }
    }
    
    /**
     * Saves this CrashReport to the given file and returns a value indicating whether we were successful at doing so.
     */
    		/*
    public boolean saveToGist(File p_147149_1_)
    {
    	GistFile file = new GistFile();
    	file.setContent("System.out.println(\"Hello World\");");
    	Gist gist = new Gist();
    	gist.setDescription("Prints a string to standard out");
    	gist.setFiles(Collections.singletonMap("Hello.java", file));
    	GistService service = new GistService();
    	service.getClient().setCredentials("user", "passw0rd");
    	gist = service.createGist(gist); //returns the created gist
    	
        }
    }
    		 */
}
