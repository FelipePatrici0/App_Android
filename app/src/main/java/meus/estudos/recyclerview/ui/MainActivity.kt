package meus.estudos.recyclerview.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.toolbar.*
import meus.estudos.recyclerview.R
import meus.estudos.recyclerview.adapter.JogosAdapter
import meus.estudos.recyclerview.datasource.Datasource

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iniciarRecyclerView()
        insertToolbar()
        buttonCadastrarJogo.setOnClickListener(this)
    }

    private fun insertToolbar() {
        setSupportActionBar(toolbar)
        supportActionBar!!.title = "My Game App"
    }

    override fun onClick(v: View) {
        if(v.id == R.id.buttonCadastrarJogo){
            val intent = Intent (this, CadastroJogoActivity::class.java)
            startActivity(intent)
        }
    }

    private fun iniciarRecyclerView() {
        recyclerViewJogos.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerViewJogos.adapter = JogosAdapter(Datasource.getJogos())
    }


}