<%-- 
    Document   : Signup
    Created on : Sep 25, 2023, 2:56:46 PM
    Author     : Kiet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Sign up</title>
        <link rel="stylesheet" href="/Signup_style.css">
    </head>
    <body>
        <div class="Signup_Container">
            <div class="Signup_c_left">
                <div class="Signup_banner">
                    <img src="img/Rectangle4.png" alt="" class="Signup_banner_one">
                    <img src="img/Rectangle5.png" alt="" class="Signup_banner_two">
                </div>
            </div>
            <div class="section section_1">
                <div id="Signup_error" class="error">
                    <p id="error_msg"></p>
                    <span id="close"><ion-icon  name="close-circle-outline"></ion-icon></span>
                </div>
                <div class="Sign_up">
                    <form action="SignUp" id="form_sign up" method="POST">
                        <h1>Sign up</h1>
                        <div class="Signup_quote"><text>Sign up to experience shopping features for you</text></div>
                        <div class="input_box">
                            <input type="text" name="txtUsername" id="username" placeholder="Username">
                            <ion-icon name="person-outline"></ion-icon>
                        </div>
                        <div class="input_box">
                            <input type="email" name="txtEmail" id="email" placeholder="Email">
                            <ion-icon name="lock-closed-outline"></ion-icon>
                        </div>
                        <div class="input_box">
                            <input type="password" name="txtPassword" id="password" placeholder="Password">
                            <ion-icon name="lock-closed-outline"></ion-icon>
                        </div>

                        <div class="Login_common">
                            <div class="Login_rem">
                                <input type="checkbox" name="" id="">
                                <span>I agree all statement in</span> <span>Terms & conditions</span>
                            </div>

                        </div>
                        <div class="Login">
                            <div class="Login_button">
                                <input type="submit" value="Sign up" id="Login_btn">
                            </div>
                            <a class="Login_account" href="#">Already have an account?</a>
                            <a class="create_account" href="#">Login</a>
                            <ion-icon name="arrow-forward-outline"></ion-icon>
                        </div>
                    </form>
                </div>
            </div> 
        </div>  


        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
        <script>

            <%String alertMess = (String) request.getAttribute("Wrong");
                        if (alertMess != null && !alertMess.isEmpty()) {%>
            let errorr = document.getElementById("Login_error");
            let errormsg = document.getElementById("error_msg");
    errormsg.innerHTML = "<%=alertMess%>";
            errorr.classList.add("error_show");
            <%
                        }
            %>
        </script>
        <script src="/SignUpScript.js"></script>
    </body>
</html>
