<%-- 
    Document   : footer.jsp
    Created on : 19-Jul-2021, 10:23:35 PM
    Author     : dev2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<body>

    <!--Footer-->
    <div class="foooter">
        <div class="row nfooter">
            <div class="col-md-3 nfooter_d1 left" >

                <h4 class="nfooter_h">Our Website</h4>
                <p class="nfooter_p"><a hre="#"><i class="fa fa-home" ></i> &nbsp;&nbsp;Home</a></p>
                <p class="nfooter_p"><a hre="#"><i class="fa fa-heartbeat" ></i> &nbsp;&nbsp;About Us</a></p>
                <p class="nfooter_p"><a hre="#"><i class="fa fa-cog" ></i>&nbsp;&nbsp; Services</a></p>
                <p class="nfooter_p"><a hre="#"><i class="fa fa-question-circle" ></i>&nbsp;&nbsp; FAQ</a></p>

            </div>

            <div class="col-md-3 nfooter_d3 left">
                <h4 class="nfooter_h">Quick Links</h4>
                <p class="nfooter_p"><a hre="#"><i class="fa fa fa-stethoscope" ></i>&nbsp; Cancer Treatment</a></p>
                <p class="nfooter_p"><a hre="#"><i class="fa fa fa-user-md" ></i>&nbsp; Typhoid Treatment</a></p>
                <p class="nfooter_p"><a hre="#"><i class="fa fa fa-plus-square" ></i>&nbsp; Covid Treatment</a></p>
                <p class="nfooter_p"><a hre="#"><i class="fa fa-hospital-o" ></i>&nbsp; Fat Reduction</a></p>
            </div>
            <div class="col-md-3 nfooter_d3 left">
                <h4 class="nfooter_h">Head Office</h4>
                <p class="nfooter_p"><a hre="#"><i class="fa fa-map-marker" ></i>&nbsp; Sector 32, IT Park, Noida</a></p>
                <p class="nfooter_p"><a hre="#"><i class="fa fa-phone" ></i>&nbsp; 91-9988998800</a></p>
                <p class="nfooter_p"><a hre="#"><i class="fa fa-telegram" ></i>&nbsp; support@sso.com</a></p>
                <p class="nfooter_p"><a hre="#"><i class="fa fa-telegram" ></i>&nbsp; medical@sso.com</a></p>
                <div class="col-md-12 nfooter_icon left">
                    <i class="fa fa-facebook-square nfooter_f_icon" ></i>
                    <i class="fa fa-twitter-square nfooter_f_icon" ></i>
                    <i class="fa fa-google-plus-square nfooter_f_icon"></i>
                    <i class="fa fa-linkedin-square nfooter_f_icon" ></i>
                    <i class="fa fa-youtube-square nfooter_f_icon" ></i>
                </div>
            </div>
           
            <div class="col-md-3 nfooter_d2 left">

                <div id="map-container-google-1" class="z-depth-1-half map-container nfooter_map" >
                    <iframe src="https://maps.google.com/maps?q=manhatan&t=&z=13&ie=UTF8&iwloc=&output=embed" frameborder="0"
                            style="border:0" allowfullscreen></iframe>
                </div>

            </div>

            <div class="col-md-12 nfooter_d4">
                <span class="right">Terms and Conditions | Privacy Policy</span>

                <span class="left">All rights reserved 2021 &copy; SSO </span>
            </div>
        </div>
    </div>





    <script type="text/javascript">
    // Get the modal
        var modal = document.getElementById("myModal");

    // Get the button that opens the modal
        var btn = document.getElementById("myBtn");

    // Get the <span> element that closes the modal
        var span = document.getElementsByClassName("close")[0];

    // When the user clicks on the button, open the modal
        btn.onclick = function () {
            modal.style.display = "block";
        }

    // When the user clicks on <span> (x), close the modal
        span.onclick = function () {
            modal.style.display = "none";
        }

    // When the user clicks anywhere outside of the modal, close it
        window.onclick = function (event) {
            if (event.target == modal) {
                modal.style.display = "none";
            }
        }
    </script>



</body>  
<script type="text/jscript" src="js/bootstrap-multiselect.js"></script>
<script type="text/jscript" src="js/main.js"></script>
<script type="text/jscript" src="js/popper.js"></script>
<script type="text/jscript" src="js/bootstrap.min.js"></script>

</html>
