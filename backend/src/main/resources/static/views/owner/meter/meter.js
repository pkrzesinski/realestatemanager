const URL = "/api/v1/meters";
let table;

$(document).ready(function () {

    $.getJSON(URL, function (result) {
        if (result.length === 0) {
            alert("No meters found.");
        } else {
            drawTable(result);
        }
    }).fail(function (response) {
        alert("Error while trying to retrieve meters: " + response.responseJSON.message);
    });
});

function drawTable(result) {
    table = $(".table").DataTable({
        data: result,
        columns: [
            {data: "id"},
            {data: "media_type"},
            {data: "serial_number"},
            {data: "apartment_id"},
        ]
    });
}