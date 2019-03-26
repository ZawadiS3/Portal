$(document).ready(function () {
    try {
        get_account_balanced();
        save_data();
    } catch (err) {
        alert(err.message);
    }
});


function get_account_balanced() {
    $('.add_more').click(function () {
        var more_radio = '';

        var res = '';
        $.post('radio.jsp', function (data) {//The page "radio" will bring data from database
            $('.res_box').append(data);
        });


    });


}

function save_data() {
    $('.butn').click(function () {
        $('.res_box > .rdios').each(function (index, value) {//This is just the loop

            var type = $(this).data('type');
            var selected = $(this).is(':checked');
            
            var sum_debit=0;
            var sum_crebit=0;
            if (selected) {
                if (type == 'credit') {//if credit
                    console.log(type );
                    
                    
                        
                        } else {//it is debit
                    console.log(type);
                }
            }
        });
    });
}


