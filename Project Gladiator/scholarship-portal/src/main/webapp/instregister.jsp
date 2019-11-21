<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>

<head>
    <title></title>
    <!-- <link rel="stylesheet" href="app.css" type="text/css"> -->
	<link href="<c:url value="/resources/css/app.css" />" rel="stylesheet">
</head>

<body>
    <div class="login-page">

        <div class="form">
            <h2>Institute Registration</h2>

            <form class="login-form" action="register" method="post">

                <table>
                
                    <tr>
                        <td>Institute Category :</td>
                        <td>  <select name="instituteCategory" style="width: 200px; height:35px ;align-self: left;">
                            <option value="Government">Government</option>
                            <option value="Autonomous">Autonomous</option>
                            <option value="Private">Private</option>
                           
                          </select></td>
                    </tr>

                    <tr>
                        <td>Institute Name :</td>
                        <td><input type="text" name="instituteName" required><br></td>
                    </tr>

                    <tr>
                        <td>Institute DISE Code :</td>
                        <td><input type="text" name="instituteDISECode" pattern="[1-9]{1}[0-9]{3}" required><br></td>
                    </tr>

                    <tr>
                        <td>University name :</td>
                        <td><input type="text" name="universityName" required><br></td>
                    </tr>

                    <tr>
                        <td>Institute Password :</td>
                        <td><input type="password" name="institutePass"><br></td>
                    </tr>

                    <tr>
                        <td>Institute Establishment Certificate :</td>
                        <td><input type="file" name="instituteEstbCert" required><br></td>
                    </tr>

                    <tr>
                        <td>Institute Affiliation Certificate :</td>
                        <td><input type="file" name="instituteAffCert" required><br></td>
                    </tr>

                    <tr>
                        <td>Institute location :</td>
                        <td><input type="text" name="instituteLoc" required><br></td>
                    </tr>

                    <tr>
                        <td>Institute city :</td>
                        <td><input type="text" name="instituteCity" required><br></td>
                    </tr>

                    <tr>
                        <td>Institute state :</td>
                        <td><input type="text" name="instituteState" required><br></td>
                    </tr>

                    <tr>
                        <td>Institute pincode :</td>
                        <td><input type="text" name="institutePincode" pattern="[1-9]{1}[0-9]{5}" required><br></td>
                    </tr>

            

                    <tr>
                        <td><button type="submit">Submit</button></td>
                    <td> <button type="reset">Reset</button></td>
                    </tr>

                </table>

            </form>
        </div>
    </div>

</body>

</html>