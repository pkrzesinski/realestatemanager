const URL = "/api/v1/readings";
let table;

$(document).ready(function () {

    $.getJSON(URL, function (result) {
        if (result.length === 0) {
            alert("No readings found.");
        } else {
            drawTable(result);
        }
    }).fail(function (response) {
        alert("Error while trying to retrieve readings: " + response.responseJSON.message);
    });
});

function drawTable(result) {
    table = $(".table").DataTable({
        data: result,
        columns: [
            {data: "id"},
            {data: "mediaType"},
            {data: "readingDate"},
        ]
    });
}