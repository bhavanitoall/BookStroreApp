<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Edit Book</title>
</head>
<body>
    <div align="center">
        <h1>Edit Book</h1>
        <br />
        <form action="#" th:action="@{/save}" th:object="${book}"
            method="post">
 
            <table border="0" cellpadding="10">
                <tr>             
                    <td>Book ID:</td>
                    <td>
                        <input type="text" th:field="*{id}" readonly="readonly" />
                    </td>
                </tr>        
                <tr>             
                    <td>Book Name:</td>
                    <td>
                        <input type="text" th:field="*{name}" />
                    </td>
                </tr>
                <tr>
                    <td>Auther:</td>
                    <td><input type="text" th:field="*{auther}" /></td>
                </tr>
                
                <tr>
                    <td>Price:</td>
                    <td><input type="text" th:field="*{price}" /></td>
                </tr>                            
                <tr>
                    <td colspan="2"><button type="submit">Save</button> </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>