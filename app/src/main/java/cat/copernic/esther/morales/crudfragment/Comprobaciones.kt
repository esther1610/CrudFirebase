package cat.copernic.esther.morales.crudfragment

class Comprobaciones {

    public fun contieneTexto(txt: String): Boolean{
        var resultado = false
        if (txt != null){
            if (!txt.equals("")){
                resultado = true
            }else{
                resultado = false
            }
        }else{
            resultado = false
        }
        return resultado
    }
}