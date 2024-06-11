package cossio.jesus.thecheezery

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import cossio.jesus.thecheezery.R.*

class Sweets : AppCompatActivity() {
    var sweets = ArrayList<Product>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_sweets)

        agregaProductos()

        var listview: ListView = findViewById(R.id.listView) as ListView

        var adaptador: AdaptadorProductos =
            AdaptadorProductos(this, sweets)
        listview.adapter=adaptador
    }

    fun agregaProductos(){
        sweets.add(Product("Blueberry cake", drawable.blueberrycake, "Vanilla cake flavor, topped with cheese topping and blueberries.", 6.0))
        sweets.add(Product("Chocolate cupcake", drawable.chocolatecupcake, "Chocolate cupcakes topped with butter cream and cherries", 3.0))
        sweets.add(Product("Lemon tartalette", drawable.lemontartalette, "Pastry shell with a lemon flavored filling", 4.0))
        sweets.add(Product("Red Velvet cake", drawable.redvelvetcake, "Soft, moist, buttery cake topped with an easy cream cheese frosting.", 6.0))
        sweets.add(Product("Cherry cheesecake", drawable. strawberrycheesecake, "This cherry topped cheesecake is positively creamy and delicious and will be your new favorite dessert.", 7.0))
        sweets.add(Product("Tiramisu", drawable.tiramisu, "Coffee-flavored Italian dessert", 6.0))

    }

    private class AdaptadorProductos: BaseAdapter {
        var productos= java.util.ArrayList<Product>()
        var contexto: Context? = null

        constructor(contexto: Context, productos: ArrayList<Product>){
            this.productos=productos
            this.contexto=contexto

        }

        override fun getCount(): Int {
            return productos.size
        }

        override fun getItem(position: Int): Any {
            return productos[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var prod= productos[position]
            var inflador= LayoutInflater.from(contexto)
            var vista=inflador.inflate(layout.producto_view,null)

            var imagen: ImageView = vista.findViewById(id.producto_img)
            var nombre: TextView = vista.findViewById(id.producto_nombre)
            var descripcion: TextView = vista.findViewById(id.producto_descripcion)
            var precio: TextView = vista.findViewById(id.producto_precio)

            imagen.setImageResource(prod.image)
            nombre.text = prod.name
            descripcion.text = prod.description
            precio.text = "$${prod.price}"

            return vista
        }
    }
}