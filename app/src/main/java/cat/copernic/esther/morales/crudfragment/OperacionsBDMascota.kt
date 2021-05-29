package cat.copernic.esther.morales.crudfragment

interface OperacionsBDMascota {

    fun guardar(mascota: Mascota): Boolean //Le enviamos un perfil para guardar
    fun eliminar(mascota: Mascota): Boolean //Enviamos un perfil, en el que tendra el dato a buscar, ejemplo un perfil vacio con el dni por si la busqueda es por dni
    fun modificar(mascota: Mascota): Boolean //Los nuevos datos, el dni y datos que no varian no se deberian poder modificar
    fun buscar(mascota: Mascota): Boolean //ya especificaremos por que datos buscar...

}


