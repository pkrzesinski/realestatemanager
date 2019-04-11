const URL = "/api/v1/invoices";
let table;

$(document).ready(function () {

    $.getJSON(URL, function (result) {
        if (result.length === 0) {
            alert("No invoices found.");
        } else {
            drawTable(result);
        }
    }).fail(function (response) {
        alert("Error while trying to retrieve invoices: " + response.responseJSON.message);
    });
});

function drawTable(result) {
    table = $(".table").DataTable({
        data: result,
        columns: [
            {data: "id"},
            {data: "invoiceNumber"},
            {data: "Amount"},
            {data: "issueDate"},
        ]
    });
}