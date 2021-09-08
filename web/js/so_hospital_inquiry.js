/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(function () {
    debugger;
    $("#mobile").keypress(function (e) {
        var keyCode = e.keyCode || e.which;
        var mobile_val = $('#mobile').val();
        if (mobile_val != null && mobile_val != undefined && mobile_val.length >= 10) {
            $('#contact_error').html("Max 10 digit numbers allowed.");
            return false;
        } else {
            $('#contact_error').html("");
        }
        //Regex for Valid Characters i.e. Numbers.
        var regex = /^[0-9]+$/;

        //Validate TextBox value against the Regex.
        var isValid = regex.test(String.fromCharCode(keyCode));
        if (!isValid) {
            $('#contact_error').html("Only Numbers allowed.");
        } else {
            $('#contact_error').html("");
        }

        return isValid;
    });
});

$(function () {
    $("#pincode").keypress(function (e) {
        var keyCode = e.keyCode || e.which;

        var mobile_val = $('#pincode').val();
        if (mobile_val != null && mobile_val != undefined && mobile_val.length >= 6) {
            $('#pin_error').html("Max 6 digit numbers allowed.");
            return false;
        }
        //Regex for Valid Characters i.e. Numbers.
        var regex = /^[0-9]+$/;

        //Validate TextBox value against the Regex.
        var isValid = regex.test(String.fromCharCode(keyCode));
        if (!isValid) {
            $("#pin_error").html("Only Numbers allowed.");
        }else{
            $("#pin_error").html("");
        }

        return isValid;
    });
});


function validate_form() {
    var err = 0;
    if ($('#firstName').val() == null || $('#firstName').val() == '' || $('#firstName').val() == undefined) {
        err++;
        $('#first_name_error').html("Name is mandatory");
        //alert("First Name is mandatory field");
        //return false;
    } else {
        $('#first_name_error').html("");
    }
    if ($('#lastName').val() == null || $('#lastName').val() == '' || $('#lastName').val() == undefined) {
        // err++;
    }
    if ($('#emailId').val() == null || $('#emailId').val() == '' || $('#emailId').val() == undefined) {
        //  err++;
    } else {
        var emailId = $('#emailId').val();
        var emailReg = /^([\w-\.]+@([\w-]+\.)+[\w-]{2,4})?$/;
        if (emailReg.test(emailId)) {

        } else {
            alert("Email ID is invalid!");
            return false;
        }

    }
    if ($('#mobile').val() == null || $('#mobile').val() == '' || $('#mobile').val() == undefined) {
        err++;
        $('#contact_error').html("Mobile number is mandatory.");
        //return false;
    }else{
         $('#contact_error').html("");
    }
    if ($('#address').val() == null || $('#address').val() == '' || $('#address').val() == undefined) {
        //   err++;
    }
    if ($('#pincode').val() == null || $('#pincode').val() == '' || $('#pincode').val() == undefined) {
        // err++;
    }
    if ($('#description').val() == null || $('#description').val() == '' || $('#description').val() == undefined) {
        //err++;
    }
    if ($('#purpose').val() == null || $('#purpose').val() == '' || $('#purpose').val() == undefined) {
        err++;
        $('#purpose_error').html("Purpose is mandatory.");
        //alert("Purpose is mandatory field");
        //return false;
    }
    if (parseInt(err) > 0) {
        return false;
    } else {
        var myform = document.getElementById("inquiry_form_id");
        var fd = new FormData(myform);
        $.ajax({
            url: contextPath + "/inquiry.do?Method=execute",
            data: fd,
            cache: false,
            processData: false,
            contentType: false,
            type: 'POST',
            success: function (response) {
                showToast('Enquiry submitted, Our doctors will reach out to you soon')
                $('#firstName').val('');
                $('#lastName').val('');
                $('#emailId').val('');
                $('#mobile').val('');
                $('#address').val('');
                $('#pincode').val('');
                $('#description').val('');
                $('#purpose').val('');
                console.log(response);
            }
        });

    }

}