<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Simple Pagination</title>
</head>
<body>

<?php
// Simulated database connection
$database = [
    "Record 1", "Record 2", "Record 3", "Record 4", "Record 5",
    "Record 6", "Record 7", "Record 8", "Record 9", "Record 10",
    "Record 11", "Record 12", "Record 13", "Record 14", "Record 15"
];

// Pagination variables
$recordsPerPage = 5;
$page = isset($_GET['page']) ? $_GET['page'] : 1;
$offset = ($page - 1) * $recordsPerPage;
$recordsToShow = array_slice($database, $offset, $recordsPerPage);

// Display records
echo "<ul>";
foreach ($recordsToShow as $record) {
    echo "<li>$record</li>";
}
echo "</ul>";

// Pagination links
echo "<p>";
if ($page > 1) {
    echo "<a href='?page=" . ($page - 1) . "'>Previous</a> ";
}
if ($offset + $recordsPerPage < count($database)) {
    echo "<a href='?page=" . ($page + 1) . "'>Next</a>";
}
echo "</p>";
?>

</body>
</html>