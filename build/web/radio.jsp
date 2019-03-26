<%-- 
    Document   : radio
    Created on : Jan 30, 2019, 4:52:43 PM
    Author     : zawadi
--%>


<br/><br/>
<table class="resul_table">

    <tr>
        <td>
            <select class="cbo_account">
                <option value="1">  Account 1   </option>
                <option value="2">  Account 2   </option>
                <option value="3">  Account 3   </option>
                <option value="4">  Account 4   </option>
                <option value="5">  Account 5   </option>
                <option value="6">  Account 6   </option>
            </select>

        </td>
        <td>
            <input type="text"/>

        </td>

        <td class="radios_td">
            <input type="radio" class="rdios radio_dr" name="dr_cr"data-type="debit" id="radio_dr" /> <label for="radio_dr" > Debit</label><br/>
            <input type="radio" class="rdios radio_cr" name="dr_cr"data-type="credit" id="radio_cr" /> <label for="radio_cr" > Credit</label>
        </td>
        <td>Cell</td>
    </tr>

</table>

<script>

    $('.rdios').change(function () {
        console.log('Changed:   ' + $(this).data('type'));
    });
    $('.cbo_account').change(function () {

        var item = $(this, 'option:selected').val();
        var radio = $(this).closest('tr').find('.radios_td > .radio_dr').data('type');
        if (item == 1) {
            
        } else if (item == 2) {
            radio.attr('checked','checked');
            console.log('selected 2: ' + radio);
        } else if (item == 3) {

        } else if (item == 4) {
            
        } else if (item == 5) {

        } else if (item == 6) {

        }
    });
    <%


    %>


</script>


