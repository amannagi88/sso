/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function __search(link) {
    if (parseInt(link) == 3) {        
        document.forms[0].action = contextPath+"/service.do?Method=enquiry";
    }    
    document.forms[0].submit();
}