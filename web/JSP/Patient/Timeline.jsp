<%-- 
    Document   : Timeline
    Created on : 25-Jul-2021, 8:37:33 PM
    Author     : dev1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SSO</title>
        <jsp:include page = "../../header.jsp" />   
        <link rel ="stylesheet" href="<%=request.getContextPath()%>/assets/css/style_timeline.css" type="text/css">

        <script src="<%=request.getContextPath()%>/assets/js/main_.js"></script>


        <script>document.getElementsByTagName("html")[0].className += " js";</script>
    </head>
    <body>




        <div class="container-fluid timeline-header">

            <h3 class="timeline-heading "> Medical History</h3>

            <section class="cd-timeline js-cd-timeline">
                <div class="container max-width-lg cd-timeline__container">
                    <div class="cd-timeline__block">
                        <div class="cd-timeline__img cd-timeline__img--picture">
                            <!--<img src="assets/img/cd-icon-picture.svg" alt="Picture">-->
                            <i class="fa fa-list-alt timeline-icon"></i>
                        </div> <!-- cd-timeline__img -->

                        <div class="cd-timeline__content text-component">
                            <h2>Asthma Diagnostic</h2>
                            <p class="color-contrast-medium">
                                Differentiating asthma from chronic obstructive pulmonary disease (COPD) is difficult. Steroid trial may be of 
                                help but has several pitfalls. The present study aims to assess the value of past clinical profile of asthma and its differential diagnosis from 
                                OPD in male smokers and thereby to formulate clinical parameters to diagnose bronchial asthma in such patients.
                            </p>

                            <div class="flex justify-between items-center">
                                <span class="cd-timeline__date">Jan 14</span>
                                <div class="timeline-button">
                                    <a href="#0" class="btn btn--subtle">Read more</a>
                                </div>
                            </div>
                        </div> <!-- cd-timeline__content -->
                    </div> <!-- cd-timeline__block -->

                    <div class="cd-timeline__block">
                        <div class="cd-timeline__img cd-timeline__img--movie">
                            <i class="fa fa-file-text timeline-icon"></i>
                        </div> <!-- cd-timeline__img -->

                        <div class="cd-timeline__content text-component">
                            <h2>History of Cancer</h2>
                            <p class="color-contrast-medium">color-contrast-mediThis mini-review chronicles the history of cancer ranging from cancerous growths discovered in dinosaur fossils, suggestions 
                                of cancer in Ancient Egyptian papyri written in 1500–1600 BC, and the first documented case of human cancer 2,700 years ago, to contributions by 
                                pioneers beginning.
                            </p>

                            <div class="flex justify-between items-center">
                                <span class="cd-timeline__date">Jan 18</span>
                                <div class="timeline-button">
                                    <a href="#0" class="btn btn--subtle">Read more</a>
                                </div>          </div>

                        </div> <!-- cd-timeline__content -->
                    </div> <!-- cd-timeline__block -->


                    <div class="cd-timeline__block">
                        <div class="cd-timeline__img cd-timeline__img--picture">
                            <i class="fa fa-list-alt timeline-icon"></i>
                        </div> <!-- cd-timeline__img -->

                        <div class="cd-timeline__content text-component">
                            <h2>Asthma Diagnostic</h2>
                            <p class="color-contrast-medium">
                                Differentiating asthma from chronic obstructive pulmonary disease (COPD) is difficult. Steroid trial may be of 
                                help but has several pitfalls. The present study aims to assess the value of past clinical profile of asthma and its differential diagnosis from 
                                OPD in male smokers and thereby to formulate clinical parameters to diagnose bronchial asthma in such patients.
                            </p>

                            <div class="flex justify-between items-center">
                                <span class="cd-timeline__date">Jan 24</span>
                                <div class="timeline-button">
                                    <a href="#0" class="btn btn--subtle">Read more</a>
                                </div>
                            </div>
                        </div> <!-- cd-timeline__content -->
                    </div> <!-- cd-timeline__block -->

                    <div class="cd-timeline__block">
                        <div class="cd-timeline__img cd-timeline__img--location">
                            <i class="fa fa-file-text timeline-icon"></i>
                        </div> <!-- cd-timeline__img -->

                        <div class="cd-timeline__content text-component">
                            <h2>History of Cancer</h2>
                            <p class="color-contrast-medium">color-contrast-mediThis mini-review chronicles the history of cancer ranging from cancerous growths discovered in dinosaur fossils, suggestions 
                                of cancer in Ancient Egyptian papyri written in 1500–1600 BC, and the first documented case of human cancer 2,700 years ago, to contributions by 
                                pioneers beginning.
                            </p>

                            <div class="flex justify-between items-center">

                                <span class="cd-timeline__date">Feb 14</span>
                                <div class="timeline-button">

                                    <a href="#0" class="btn btn--subtle">Read more</a>
                                </div>
                            </div>
                        </div> <!-- cd-timeline__content -->
                    </div> <!-- cd-timeline__block -->

                    <div class="cd-timeline__block">
                        <div class="cd-timeline__img cd-timeline__img--location">
                            <i class="fa fa-list-alt timeline-icon"></i>  
                        </div> <!-- cd-timeline__img -->

                        <div class="cd-timeline__content text-component">
                            <h2>Asthma Diagnostic</h2>
                            <p class="color-contrast-medium">
                                Differentiating asthma from chronic obstructive pulmonary disease (COPD) is difficult. Steroid trial may be of 
                                help but has several pitfalls. The present study aims to assess the value of past clinical profile of asthma and its differential diagnosis from 
                                OPD in male smokers and thereby to formulate clinical parameters to diagnose bronchial asthma in such patients.
                            </p>

                            <div class="flex justify-between items-center">
                                <span class="cd-timeline__date">Feb 18</span>
                                <div class="timeline-button">

                                    <a href="#0" class="btn btn--subtle">Read more</a>
                                </div></div>
                        </div> <!-- cd-timeline__content -->
                    </div> <!-- cd-timeline__block -->

                    <div class="cd-timeline__block">
                        <div class="cd-timeline__img cd-timeline__img--movie">
                            <i class="fa fa-file-text timeline-icon"></i>
                        </div> <!-- cd-timeline__img -->

                        <div class="cd-timeline__content text-component">
                            <h2>History of Cancer</h2>
                            <p class="color-contrast-medium">color-contrast-mediThis mini-review chronicles the history of cancer ranging from cancerous growths discovered in dinosaur fossils, suggestions 
                                of cancer in Ancient Egyptian papyri written in 1500–1600 BC, and the first documented case of human cancer 2,700 years ago, to contributions by 
                                pioneers beginning.
                            </p>

                            <div class="flex justify-between items-center">

                                <span class="cd-timeline__date">Feb 26</span>
                            </div>
                        </div> <!-- cd-timeline__content -->
                    </div> <!-- cd-timeline__block -->
                </div>
            </section> <!-- cd-timeline -->
        </div>



    </body
    <jsp:include page = "../../footer.jsp" />   
</html>
