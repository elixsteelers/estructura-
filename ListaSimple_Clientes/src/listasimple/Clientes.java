package listasimple;

class Clientes {
    Object nombre;
    Object direccion;
    Object telefono;
    Object cumple;

    public Clientes(Object nombre, Object direccion, Object telefono, Object cumple) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cumple = cumple;
    }

    public String toString() {
        return "Nombre: " + nombre + "\nDireccion: " + direccion + "\nTelefono: " + telefono + "\nCumple: " + cumple;
    }
}