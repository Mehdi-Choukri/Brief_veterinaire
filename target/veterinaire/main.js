   var v_password= document.getElementById("id_Password");
  var v_confirmpw= document.getElementById("id_ConfirmPw");

 function check_confirmPW()
         {
          if (v_password.value ==v_confirmpw.value) {
          document.getElementById('id_confirm_pw_error').style.color = 'green';
          document.getElementById('id_confirm_pw_error').innerHTML = 'Matching';
        } else {
          document.getElementById('id_confirm_pw_error').style.color = 'red';
          document.getElementById('id_confirm_pw_error').innerHTML = 'Not matching';
        }
         }