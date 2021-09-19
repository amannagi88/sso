<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<title> SSO</title>
    <meta name="google-signin-client_id" content="92588129338-curjkvtk8v283nmseug1kjjpddq4bqsi.apps.googleusercontent.com">

        <jsp:include page = "header.jsp" />    
        <script src="https://apis.google.com/js/platform.js?onload=renderButton" async defer></script>
        <script src="<%=request.getContextPath()%>/js/home.js" type="text/javascript"></script>
        <body>
            <!--Search login bar-->

            <!--Carousel-->


            <div class="bd-example">
                <div id="carouselExampleCaptions" class="carousel slide carousel-fade" data-ride="carousel">
                    <ol class="carousel-indicators">
                        <li data-target="#carouselExampleCaptions" data-slide-to="0" class="active"></li>
                        <li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
                        <li data-target="#carouselExampleCaptions" data-slide-to="2"></li>
                    </ol>


                    <div class="carousel-inner item_slider">
                        <div class="carousel-item active">
                            <img src="img/1.jpg" class="d-block w-100 " alt="...">

                  </div>
              
                  <div class="carousel-item item_slider">
                            <img src="img/4.jpg" class="d-block w-100" alt="...">
                           
                  </div>
                  <div class="carousel-item item_slider">
                    <img src="img/3.jpg" class="d-block w-100" alt="...">
                          
                  </div>
                  
                  <div class="carousel-caption d-none d-md-block">
                                    
                                        <div class="col-sm-6 div_left">
                                            <span class="slider_text">Welcome to <br/>Second Surgeon Opinion</span>
                                            <span class=" slider_text_search">Here we assist you with doctor specialization and medical condition</span>
                                                 <div class="col-md-12 lng_search">
                                                        <input type="text" class="form-control caro_input" id="inputPassword2" placeholder="Search by Services, Doctor....">
                                                 <i class="fas fa-search index_srch" aria-hidden="true"></i>
                                                 </div>
                                        </div>
                              </div>
      </div>
    <!--<a class="carousel-control-prev" href="#carouselExampleCaptions" role="button" data-slide="prev">
      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="carousel-control-next" href="#carouselExampleCaptions" role="button" data-slide="next">
      <span class="carousel-control-next-icon" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>-->
  </div>
</div>

<!--Carousel-->

<!-- Services-->
   <div class="container-fluid">        
                <section class="page-section" id="services">
                    <html:form action="/service.do?Method=search" method="post" styleId="form1">
                        <html:hidden property="serviceId" />   
                        <div class="">
                            <div class=" col-md-12 text-center welcm_heading">
                                <h3 class="section-heading ">Services we provide</h3>
                            </div>
                            <div class="row text-center">

                                <div class="col-md-4 service_">
                                    <div class="service_text">
                                        <h4 class="head_margin">Search By Specialist</h4>
                                        <p class="text-muted">You may search and contact Doctor/institution by their specialization...</p>
                                        <button class="sml_btn" onClick="__search(1)"> Know More </button>
                                    </div>
                                </div>

                                <div class="col-md-4 service_1">
                                    <div class="service_text">
                                        <h4 class="head_margin">Search By Symptoms</h4>
                                        <p class="text-muted">If you know your condition you can select the symptoms or the diagnosed disease...</p>
                                        <button class="sml_btn"> Know More </button>
                                    </div>
                                </div>
                                <div class="col-md-4 service_2">
                                    <div class="service_text">
                                        <h4 class="head_margin">Consult our Specialist</h4>
                                        <p class="text-muted">Our team can help create a history for your condition and help you choose the... </p>
                                        <button class="sml_btn" onClick="__search(3)"> Know More </button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </html:form>
                </section>
            </div>
            <!--services end-->

            <!--section 2 doctors
            <div class="container-fluid">
                <section class="page-section" id="services">
                    <div class="">
                                    <div class=" col-md-12 text-center" style="margin:2% 0% 4% 0%">
                                        <h3 class="section-heading ">Online Doctor Appointment</h3>
                                    </div>
            
                        <div class="col-md-3 left_"> 
                        <div class="card" >
                            <img src="img/doctor2.jpg" class="card-img-top" alt="...">
                            <div class="card-body text-center">
                            <h5 class="card-title">Dr. Lara Joy</h5>
                                <h6 class="card-title">Cancer Consultant</h6>
                                <div class="progress">
                                  <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60"
                                  aria-valuemin="0" aria-valuemax="100" style="width:100%">
                                          <div class="rating" >
                                                 <i class="fas fa-star left rating_icon"></i>
                                                 <i class="fas fa-star left rating_icon"></i>
                                                 <i class="fas fa-star left rating_icon"></i>
                                                 <i class="fas fa-star left rating_icon"></i>
                                                 <i class="fas fa-star left rating_icon"></i>
                                           </div>
                                   </div>
                                </div>
                                <p class="card-text"></p>
                                <a href="#" class="btn btn-primary">Book</a>
                            </div>
                        </div>
                        </div>
        
                        <div class="col-md-3 left_">
                        <div class="card ">
                            <img src="img/doctor3.jpg" class="card-img-top" alt="...">
                            <div class="card-body text-center">
                             <h5 class="card-title">Dr. Vishal Parmar</h5>
                                <h6 class="card-title">Fever Consultant</h6>
                                <div class="progress">
                                  <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60"
                                  aria-valuemin="0" aria-valuemax="100" style="width:60%">
                                          <div class="rating" >
                                                 <i class="fas fa-star left rating_icon"></i>
                                                 <i class="fas fa-star left rating_icon"></i>
                                                 <i class="fas fa-star left rating_icon"></i>
                                                 </div>
                                   </div>
                                </div>
                                <p class="card-text"></p>
                                <a href="#" class="btn btn-primary">Book</a>
                            </div>
                        </div>
                        </div>
        
                        <div class="col-md-3 left_">
                        <div class="card " >
                            <img src="img/doctor1.jpg" class="card-img-top" alt="...">
                            <div class="card-body text-center">
                             <h5 class="card-title">Dr. Deepti jacob</h5>
                                <h6 class="card-title">Corona Consultant</h6>
                                <div class="progress">
                                  <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60"
                                  aria-valuemin="0" aria-valuemax="100" style="width:80%">
                                          <div class="rating" >
                                                 <i class="fas fa-star left rating_icon"></i>
                                                 <i class="fas fa-star left rating_icon"></i>
                                                 <i class="fas fa-star left rating_icon"></i>
                                                 <i class="fas fa-star left rating_icon"></i>
                                                 </div>
                                   </div>
                                </div>
                                <p class="card-text"></p>
                                <a href="#" class="btn btn-primary">Book</a>
                            </div>
                        </div>
                        </div>
        
                        <div class="col-md-3 left_">
                        <div class=" card ">
                            <img src="img/doctor2.jpg" class="card-img-top" alt="...">
                            <div class="card-body text-center">
                             <h5 class="card-title">Dr. Niraj Patel</h5>
                                <h6 class="card-title">TB Consultant</h6>
                                <div class="progress">
                                  <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60"
                                  aria-valuemin="0" aria-valuemax="100" style="width:30%">
                                          <div class="rating" >
                                                 <i class="fas fa-star left rating_icon"></i>
                                                 <i class="fas fa-star left rating_icon"></i>
                                                 </div>
                                   </div>
                                </div>
                                <p class="card-text"></p>
                                <a href="#" class="btn btn-primary">Book</a>
                            </div>
                        </div>
                        </div>
        
        
        </div>
        </section>
        </div>
        
         
            
            <!--section 3 ends-->



            <script type="text/javascript">
                $(document).ready(function () {
                    var itemsMainDiv = ('.MultiCarousels');
                    var itemsDiv = ('.MultiCarousels-inner');
                    var itemWidth = "";

                    $('.leftLst, .rightLst').click(function () {
                        var condition = $(this).hasClass("leftLst");
                        if (condition)
                            click(0, this);
                        else
                            click(1, this)
                    });

                    ResCarouselsSize();




                    $(window).resize(function () {
                        ResCarouselsSize();
                    });

                    //this function define the size of the items
                    function ResCarouselsSize() {
                        var incno = 0;
                        var dataItems = ("data-items");
                        var itemClass = ('.item');
                        var id = 0;
                        var btnParentSb = '';
                        var itemsSplit = '';
                        var sampwidth = $(itemsMainDiv).width();
                        var bodyWidth = $('body').width();
                        $(itemsDiv).each(function () {
                            id = id + 1;
                            var itemNumbers = $(this).find(itemClass).length;
                            btnParentSb = $(this).parent().attr(dataItems);
                            itemsSplit = btnParentSb.split(',');
                            $(this).parent().attr("id", "MultiCarousels" + id);


                            if (bodyWidth >= 1200) {
                                incno = itemsSplit[3];
                                itemWidth = sampwidth / incno;
                            } else if (bodyWidth >= 992) {
                                incno = itemsSplit[2];
                                itemWidth = sampwidth / incno;
                            } else if (bodyWidth >= 768) {
                                incno = itemsSplit[1];
                                itemWidth = sampwidth / incno;
                            } else {
                                incno = itemsSplit[0];
                                itemWidth = sampwidth / incno;
                            }
                            $(this).css({'transform': 'translateX(0px)', 'width': itemWidth * itemNumbers});
                            $(this).find(itemClass).each(function () {
                                $(this).outerWidth(itemWidth);
                            });

                            $(".leftLst").addClass("over");
                            $(".rightLst").removeClass("over");

                        });
                    }


                    //this function used to move the items
                    function ResCarousels(e, el, s) {
                        var leftBtn = ('.leftLst');
                        var rightBtn = ('.rightLst');
                        var translateXval = '';
                        var divStyle = $(el + ' ' + itemsDiv).css('transform');
                        var values = divStyle.match(/-?[\d\.]+/g);
                        var xds = Math.abs(values[4]);
                        if (e == 0) {
                            translateXval = parseInt(xds) - parseInt(itemWidth * s);
                            $(el + ' ' + rightBtn).removeClass("over");

                            if (translateXval <= itemWidth / 2) {
                                translateXval = 0;
                                $(el + ' ' + leftBtn).addClass("over");
                            }
                        } else if (e == 1) {
                            var itemsCondition = $(el).find(itemsDiv).width() - $(el).width();
                            translateXval = parseInt(xds) + parseInt(itemWidth * s);
                            $(el + ' ' + leftBtn).removeClass("over");

                            if (translateXval >= itemsCondition - itemWidth / 2) {
                                translateXval = itemsCondition;
                                $(el + ' ' + rightBtn).addClass("over");
                            }
                        }
                        $(el + ' ' + itemsDiv).css('transform', 'translateX(' + -translateXval + 'px)');
                    }

                    //It is used to get some elements from btn
                    function click(ell, ee) {
                        var Parent = "#" + $(ee).parent().attr("id");
                        var slide = $(Parent).attr("data-slide");
                        ResCarousels(ell, Parent, slide);
                    }

                });
            </script>
            <!--section end-->




            <jsp:include page = "footer.jsp" />  
        </body>
