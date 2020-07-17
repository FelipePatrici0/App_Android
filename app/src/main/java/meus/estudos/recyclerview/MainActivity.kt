package meus.estudos.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import androidx.recyclerview.widget.LinearLayoutManager
import meus.estudos.recyclerview.adapter.JogosAdapter
import meus.estudos.recyclerview.datasource.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iniciarRecyclerView()
    }

    private fun iniciarRecyclerView() {
        recyclerViewJogos.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerViewJogos.adapter = JogosAdapter(Datasource.getJogos())
    }
}