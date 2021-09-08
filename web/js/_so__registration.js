/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templat
 * es
 * and open the template in the editor.
 */


var loginStatus = {a: ''};
function onSignIn(googleUser) {
    var profile = googleUser.getBasicProfile();
    var id_token = googleUser.getAuthResponse().id_token;
    __check__login(id_token);
}

function __check__login(a) {
    var xhr = new XMLHttpRequest();
    xhr.open('POST', contextPath + '/login.do?Method=verifyAndCheck');
    xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    xhr.onload = function () {
        if (xhr.responseText == '0__0_01') {
            __create_login(a);
        } else {
            _load__dashboard();
        }
    };
    xhr.send('idtoken=' + a);
}

function __create_login(a) {
    var xhr = new XMLHttpRequest();
    xhr.open('POST', contextPath + '/login.do?Method=login');
    xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    xhr.onload = function () {
        _load__dashboard();
    };
    xhr.send('idtoken=' + a);
}

function renderButton() {
    gapi.signin2.render('my-signin2', {
        'scope': 'profile email',
        'width': 240,
        'height': 50,
        'longtitle': true,
        'theme': 'dark',
        'onsuccess': onSuccess,
        'onfailure': onFailure
    });
}


function onSuccess(googleUser) {
    hideButton();
    var id_token = googleUser.getAuthResponse().id_token;
    __check__login(id_token);
    //console.log('Logged in as: ' + googleUser.getBasicProfile().getName());
}
function onFailure(error) {
    showButton();
    console.log(error);
}

//Dropzone.autoDiscover = false;

//$(document).ready(function() {
//    $("#drop_your_files").dropzone({
//        maxFiles: 2000,
//        url: contextPath + "/UploadFile.do",
//        success: function(file, response) {
//            console.log(response);
//        }
//    });
//});

function showButton() {
    $('#my-signin2').show();
}

function hideButton() {
    $('#my-signin2').hide();
}

function showStepsTax(step) {
    $('#my-signin2').hide();
    $('.smpl-step').show();
    //$('#first_div').show();
    $('#logBtnErp').html('');
    $('#logBtnErp').html('<a class="nav-link" href=\"' + contextPath + '/link.do?Method=login\"> Logout</a>');
}


function showFilingStep1() {
    $("#first_div").fadeIn(500);
    $("#filing_table").fadeOut(400);
    //$('#first_div').show();
    //$('#filing_table').hide();
}

function showToast(message) {

    $('.toast-body').html(message);
    $('.toast').toast({autohide: true, delay: 10000});
    $('.toast').toast('show');

}