/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function fetch_count() {
    $.ajax({
        url: contextPath + "/admin.do?Method=getCounts",        
        cache: false,
        processData: false,
        contentType: false,
        type: 'GET',
        success: function (response) {
            alert('aaa'+response)
            console.log(response);
        }
    });
}

fetch_count();