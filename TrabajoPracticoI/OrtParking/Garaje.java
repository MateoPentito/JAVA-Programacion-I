package OrtParking;

import java.util.ArrayList;

public class Garaje {

	private static int MAX_MESES_ADEUDADOS = 3;
	private String codigo;
	private Tablero tablero;
	private ArrayList<Vehiculo> vehiculosEstacionados;
	private ArrayList<Vehiculo> vehiculosRetirados;

	public Garaje(String codigo, Tablero tablero) {
		this.codigo = codigo;
		this.tablero = tablero;
		this.vehiculosEstacionados = new ArrayList<>();
		this.vehiculosRetirados = new ArrayList<>();
	}

	public void vehiculosSinLlave() {
		for (Vehiculo vehiculo : this.vehiculosEstacionados) {
			if (tablero.devolverLlave(vehiculo.getPatente()) == null) {
				System.out.println("Cod Garaje: " + codigo + " - Patente: " + vehiculo.getPatente());

			}
		}
	}

	public Resultado estacionarVehiculo(String patente) {
		Resultado resultado = null;

		if (vehiculoEstacionar(patente)) {
			resultado = Resultado.INGRESO_OK;
		}else if (vehiculoAdeuda(patente)) {
			resultado = Resultado.NO_ESTACIONA_ADEUDA;
		} else if (vehiculoNoEncontrado(patente)) {
			resultado = Resultado.VEHICULO_NO_HABILITADO;
		} else if (vehiculoYaEstacionado(patente)) {
			resultado = Resultado.VEHICULO_YA_ESTACIONADO;
		} 

		return resultado;
	}

	// Si devuelve true, se pudo encontrar el vehiculo
	private boolean vehiculoNoEncontrado(String patente) {
		boolean encontrado = false;
		if (buscarVehiculo(patente) == null) {
			encontrado = true;
		}
		return encontrado;
	}

	// Si devuelve true, si el vehiculo ya estaba estacionado
	private boolean vehiculoYaEstacionado(String patente) {
		int i = 0;
		boolean vehiculoEstacionado = false;
		while (i < this.vehiculosEstacionados.size() && !vehiculoEstacionado) {
			if (this.vehiculosEstacionados.get(i).getPatente().equals(patente)) {
				vehiculoEstacionado = true;
			} else {
				i++;
			}
		}
		return vehiculoEstacionado;
	}

	// Si devuelve true, si el vehiculo tiene 3 meses adeudados
	private boolean vehiculoAdeuda(String patente) {
		boolean adeuda = false;
		Vehiculo vehiculo = buscarVehiculo(patente);
		if (vehiculo.getMesesAdeudados() > MAX_MESES_ADEUDADOS) {
			adeuda = true;
		}
		return adeuda;
	}

	// Si devuelve true, si el vehiculo se pudo estacionar
	private boolean vehiculoEstacionar(String patente) {
		boolean seEstaciona = false;

		if (buscarVehiculo(patente) == null) {
			this.vehiculosEstacionados.add(new Vehiculo(patente));
			System.out.println("Se estaciono el vehiculo: " + buscarVehiculo(patente).toString());
			seEstaciona = true;
		}

		return seEstaciona;
	}

	// Devuelve el vehiculo pasado por parametro o null
	private Vehiculo buscarVehiculo(String patente) {
		Vehiculo vehiculoEncontrado = null;
		int i = 0;

		while (i < this.vehiculosEstacionados.size() && vehiculoEncontrado == null) {
			if (this.vehiculosEstacionados.get(i).getPatente().equals(patente)) {
				vehiculoEncontrado = this.vehiculosEstacionados.get(i);
			} else {
				i++;
			}
		}
		return vehiculoEncontrado;
	}

	public void adeudaMes(String patente) {
		Vehiculo vehiculo = buscarVehiculo(patente);
		if (vehiculo != null) {
			vehiculo.getMesesAdeudados();
		}
	}

	public void vehiculosDeudores() {
		for (Vehiculo vehiculo : this.vehiculosEstacionados) {
			System.out.println(vehiculo.toString());
		}
	}

	public void datosGaraje() {
		System.out.println("Codigo: "+codigo);
		for(Vehiculo vehiculo : this.vehiculosEstacionados) {
			System.out.println(vehiculo.toString());
		}
	}
	
	public String getCodigo() {
		return codigo;
	}

	public Tablero getTablero() {
		return tablero;
	}

	@Override
	public String toString() {
		return "Garaje [codigo=" + codigo + ", vehiculosEstacionados=" + vehiculosEstacionados.size() + "]";
	}

}
