package PatioDeComidas;

import java.util.ArrayList;

public class PatioDeComida {
	private final double NIVEL_BATERIA_CRITICO = 20;
	private final int CANTIDAD_CAJEROS = 5;
	private final int CANTIDAD_ROBOTS = 8;

	private ArrayList<Pedido> pedidos;
	private Cajero[] cajeros;
	private Robot[] robots;

	public PatioDeComida() {
		this.cajeros = new Cajero[CANTIDAD_CAJEROS];
		this.robots = new Robot[CANTIDAD_ROBOTS];
		this.pedidos = new ArrayList<>();
		inicializarCajeros();
		inicializarRobots();
	}

	/*
	 * La explotación del método mostrarPedidosConMasRiesgo que muestre por consola
	 * la información de los pedidos con más riesgo de no ser entregados, debido al
	 * nivel de batería de su robot despachador asignado.
	 */

	public void mostrarPedidosConMasRiesgo() {
		System.out.println("Los siguientes pedidos corren riesgo de ser entregados: ");
		System.out.println("NIVEL DE BATERIA CRITICO: %"+NIVEL_BATERIA_CRITICO);
		System.out.println("");
		for (int i = 0; i < this.pedidos.size(); i++) {
			Pedido pedido = this.pedidos.get(i);
			Robot robot = buscarRobot(pedido.getIdRobot());
			if(pedidoConRiego(robot)) {
				System.out.println(pedido.toString());
			}
		}
	}
	
	private boolean pedidoConRiego(Robot robot) {
		boolean riesgo = false;
		if(robot.getNivelBateria() <= NIVEL_BATERIA_CRITICO) {
			riesgo = true;
		}
		return riesgo;
	}

	/*
	 * La explotación del método informeDePedidos que devuelva (no muestre por
	 * consola) un vector de objetos que contengan, por cada pedido, la siguiente
	 * información: ▪ Monto del pedido. ▪ Apellido del cajero que lo tomó. ▪ Nivel
	 * de batería del robot asignado para despacharlo.
	 * 
	 */

	public InformePedidos[] informeDePedidos() {
		InformePedidos[] informe = new InformePedidos[this.pedidos.size()];
		String apellido;
		double nivelBateria;
		double montoAbonar = 0;
		for (int i = 0; i < informe.length; i++) {
			Robot robot = buscarRobot(this.pedidos.get(i).getIdRobot());
			apellido = this.cajeros[i].getApellido();
			montoAbonar = this.pedidos.get(i).getMontoAAbonar();
			nivelBateria = robot.getNivelBateria();

			informe[i] = new InformePedidos(montoAbonar, apellido, nivelBateria);
		}

		return informe;
	}

	/*
	 * La explotación del método montosPorCajero que devuelva (no muestre por
	 * consola) el monto total de pedidos que tomó cada cajero.
	 */
	public double montosPorCajero() {
		double monto = 0;
		for (int i = 0; i < this.cajeros.length; i++) {
			monto += montoTotalDePedidos();
		}
		return monto;
	}

	// Devuelve el monto total de los pedidos
	private double montoTotalDePedidos() {
		double monto = 0;
		for (Pedido pedido : this.pedidos) {
			monto += pedido.getMontoAAbonar();
		}
		return monto;
	}

	public void agregarPedidoCajero(int idCajero, Pedido pedido) {
		tomarPedido(pedido);
	}

	// Agrega los pedidos
	private void tomarPedido(Pedido pedido) {
		this.pedidos.add(pedido);
	}

	// Devuelve el cajero buscado por id
	private Cajero buscarCajero(int idCajero) {
		int i = 0;
		boolean encontrado = false;
		Cajero cajeroEncontrado = null;
		while (i < this.cajeros.length && !encontrado) {
			if (this.cajeros[i].getId() == idCajero) {
				cajeroEncontrado = this.cajeros[i];
				encontrado = true;
			} else {
				i++;
			}
		}
		return cajeroEncontrado;

	}

	// Muesta los cajeros
	public void mostrarInforme() {
		for (int i = 0; i < this.informeDePedidos().length; i++) {
			System.out.println(this.informeDePedidos()[i].toString());
		}
	}

	// Se busca un robot y se devuelve
	private Robot buscarRobot(String idRobot) {
		boolean encontro = false;
		Robot robotBuscado = null;
		int i = 0;
		while (i < this.pedidos.size() && !encontro) {
			if (this.pedidos.get(i).getIdRobot().equals(idRobot)) {
				encontro = true;
				robotBuscado = this.robots[i];
			} else {
				i++;
			}
		}
		return robotBuscado;
	}

	// Se inicializan los cajeros
	private void inicializarCajeros() {
		cajeros[0] = new Cajero(1, "Pentito", 1);
		cajeros[1] = new Cajero(2, "Isopi", 8);
		cajeros[2] = new Cajero(3, "Di lello", 10);
		cajeros[3] = new Cajero(4, "Shenzle", 15);
		cajeros[4] = new Cajero(5, "De parasis", 4);
	}

	// Se inicializan los robots
	private void inicializarRobots() {
		robots[0] = new Robot("A1", 20);
		robots[1] = new Robot("B1", 100);
		robots[2] = new Robot("C1", 15.50);
		robots[3] = new Robot("D1", 79.30);
		robots[4] = new Robot("E1", 02.23);
		robots[5] = new Robot("F1", 12.78);
		robots[6] = new Robot("G1", 17.88);
		robots[7] = new Robot("H1", 78);
	}

}
