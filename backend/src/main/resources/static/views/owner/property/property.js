const URL = "/api/v1/properties";
let table;


$(document).ready( function () {

    $.getJSON(URL, function (result) {
        if (result.length === 0) {
            alert("No properties found.");
        } else {
            drawTable(result);
        }
    }).fail(function (response) {
        alert("Error while trying to retrieve properties: " + response.responseJSON.message);
    });
});


function drawTable (result) {
 table = $(".table").DataTable({
        data: result,
        columns: [
            { data: "id" },
            { data: "street" },
            { data: "buildingNumber" },
            { data: "city" },
            { data: "postCode" }
        ]
    });
}