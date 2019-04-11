const URL = "/api/v1/apartments";
let table;

$(document).ready(function () {

    $.getJSON(URL, function (result) {
        if (result.length === 0) {
            alert("No apartments found.");
        } else {
            drawTable(result);
        }
    }).fail(function (response) {
        alert("Error while trying to retrieve apartments: " + response.responseJSON.message);
    });
});

function drawTable(result) {
    table = $(".table").DataTable({
        data: result,
        columns: [
            {data: "id"},
            {data: "number"},
            {data: "floor"},
            {data: "rooms"},
            {data: "size"},
            {data: "description"},
            {data: "property"},
        ]
    });
}