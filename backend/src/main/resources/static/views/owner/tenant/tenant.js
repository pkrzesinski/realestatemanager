const URL = "/api/v1/tenants";
let table;

$(document).ready(function () {

    $.getJSON(URL, function (result) {
        if (result.length === 0) {
            alert("No tenants found.");
        } else {
            drawTable(result);
        }
    }).fail(function (response) {
        alert("Error while trying to retrieve tenants: " + response.responseJSON.message);
    });
});

function drawTable(result) {
    table = $(".table").DataTable({
        data: result,
        columns: [
            {data: "id"},
            {data: "name"},
            {data: "surname"},
            {data: "email"},
            {data: "password"},
            {data: "phone"},
            {data: "documentId"},
            {data: "birthday"},
            {data: "apartment"},
        ]
    });
}