package ui

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.DialogFragment
import com.example.homework_recyclerview.Currency
import com.example.homework_recyclerview.R
import java.text.FieldPosition

class DeleteDialogFragment(var adapter: Adapter,var deletedCurrency: Currency?) :DialogFragment(R.layout.custom_dialog) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        with(view){
            findViewById<Button>(R.id.del_button).setOnClickListener {
                deletedCurrency?.let {  adapter.deleteCurrency(it)}
                dismiss()

            }
            findViewById<Button>(R.id.cancel_button).setOnClickListener {
                dismiss()
            }
        }
    }


}