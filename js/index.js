var smallBreak = 800; // Your small screen breakpoint in pixels
var columns = $('.dataTable tr').length;
var rows = $('.dataTable th').length;

$(document).ready(shapeTable());
$(window).resize(function() {
    shapeTable();
});

function shapeTable() {
    if ($(window).width() < smallBreak) {
        for (i=0;i < rows; i++) {
            var maxHeight = $('.dataTable th:nth-child(' + i + ')').outerHeight();
            for (j=0; j < columns; j++) {
                if ($('.dataTable tr:nth-child(' + j + ') td:nth-child(' + i + ')').outerHeight() > maxHeight) {
                    maxHeight = $('.dataTable tr:nth-child(' + j + ') td:nth-child(' + i + ')').outerHeight();
                }
              	if ($('.dataTable tr:nth-child(' + j + ') td:nth-child(' + i + ')').prop('scrollHeight') > $('.dataTable tr:nth-child(' + j + ') td:nth-child(' + i + ')').outerHeight()) {
                    maxHeight = $('.dataTable tr:nth-child(' + j + ') td:nth-child(' + i + ')').prop('scrollHeight');
                }
            }
            for (j=0; j < columns; j++) {
                $('.dataTable tr:nth-child(' + j + ') td:nth-child(' + i + ')').css('height',maxHeight);
                $('.dataTable th:nth-child(' + i + ')').css('height',maxHeight);
            }
        }
    } else {
        $('.dataTable td, .dataTable th').removeAttr('style');
    }
}