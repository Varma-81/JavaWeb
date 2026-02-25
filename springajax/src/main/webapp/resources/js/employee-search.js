$(document).ready(function() {
    // Search when button is clicked
    $('#searchButton').click(function() {
        performSearch();
    });
    
    // Search when Enter key is pressed in the input field
    $('#searchInput').keypress(function(e) {
        if (e.which === 13) { // Enter key
            performSearch();
        }
    });
    
    // Initial load - show all employees
    performSearch();
});

function performSearch() {
    const searchTerm = $('#searchInput').val();
    
    // Show loading message
    $('#loading').show();
    
    // Clear previous results
    $('#resultsBody').empty();
    
    // Make AJAX request
    $.ajax({
        url: 'search/ajax',
        type: 'GET',
        data: { term: searchTerm },
        success: function(employees) {
            displayResults(employees);
        },
        error: function(xhr, status, error) {
            $('#resultsBody').html('<tr><td colspan="5">Error loading results: ' + error + '</td></tr>');
        },
        complete: function() {
            $('#loading').hide();
        }
    });
}

function displayResults(employees) {
    const resultsBody = $('#resultsBody');
    
    if (employees.length === 0) {
        resultsBody.html('<tr><td colspan="5">No employees found</td></tr>');
        return;
    }
    
    employees.forEach(function(employee) {
        const row = $('<tr>');
        row.append($('<td>').text(employee.id));
        row.append($('<td>').text(employee.firstName));
        row.append($('<td>').text(employee.lastName));
        row.append($('<td>').text(employee.department));
        row.append($('<td>').text(employee.email));
        resultsBody.append(row);
    });
}