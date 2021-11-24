<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Create New Book</title>
</head>
<body>
    <div align="center">
        <h1>Create New Book</h1>
        <br />
        <form  action="/save" object=book
            method="post">
 
            <table border="0" cellpadding="10">
                <tr>
                    <td>Book Id:</td>
                    <td><input type="text" field="id" /></td>
                </tr>
                <tr>
                    <td>Name:</td>
                    <td><input type="text" field="name" /></td>
                </tr>
                <tr>
                    <td>Auther:</td>
                    <td><input type="text" field="auther" /></td>
                </tr>
                <tr>
                    <td>Price:</td>
                    <td><input type="text" field="price" /></td>
                </tr>                            
                <tr>
                    <td colspan="2"><button type="submit">Save</button> </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>