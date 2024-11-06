
package practicacolacircular;

public class Punto {/*en x y y se almacenara en el punto (coordenadas)*/
    private Object x;
    private Object y;

    /*se crea un nuevo punto, el constructor recibe dos valores y los guarda en el objeto*/
    public Punto(Object x, Object y) {
        this.x = x;
        this.y = y;
    }

    /*se devuelve el valor de x y y, donde se puede consultar que valores se tienen
    guardados en el punto*/
    public Object getX() {
        return x;
    }

    public Object getY() {
        return y;
    }

    /*aqui se puede cambiar lo svalores, esto sirve para darle nuevos valores al punto*/
    public void setX(Object x) {
        this.x = x;
    }

    public void setY(Object y) {
        this.y = y;
    }

    /*en este metodo se muestra el objeto punto cuando lo queremos impirmir*/ 
    public void mostrarCoordenadas() {
        System.out.println("Punto: (" + x.toString() + ", " + y.toString() + ")");
    }

    @Override
    public String toString() {
        return "(" + x.toString() + ", " + y.toString() + ")";
    }
}
