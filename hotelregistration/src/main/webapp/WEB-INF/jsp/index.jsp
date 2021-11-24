<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"/>
<title>BookStore Manager</title>
</head>
<body>
<div align="center">
    <h1>Book List</h1>
    <a href="/new">Create New book</a>
    <br/><br/>
    <table border="1" cellpadding="10">
        <thead>
            <tr>
                <th> ID</th>
                
                <th>Auther</th>
                <th>Name</th>

                
                <th>Price</th>
                <th>Action</th>
                
            </tr>
        </thead>
        <tbody>
            <tr th:each="book : ${book}">
                <td th:text="${book.id}"> 8</td>
                <td th:text="${book.auther}">James Gosling</td>

                <td th:text="${book.name}">Java</td>
                
                
                <td th:text="${book.price}">998</td>
                <td>
                    <a href="/{/edit+${book.id}}">Edit</a>
                    &nbsp;&nbsp;&nbsp;
                    <a href="/{/delete+${book.id}}">Delete</a>
                </td>
            </tr>
        </tbody>
    </table>
    
</div>   
</body>
</html>