package Classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Embalagem_Bebida> listaBebida = new ArrayList<Embalagem_Bebida>();
		List<Embalagem_Correio> listaCorreio = new ArrayList<Embalagem_Correio>();
		List<Embalagem_Pizza> listaPizza = new ArrayList<Embalagem_Pizza>();
		int countCadastro = 0;
		int countEstoque = 0;
		int countGeral = 0;
		double somaTotal = 0;
		double somaTotalCorreio = 0;
		double somaTotalPizza = 0;
		double somaTotalBebida = 0;
		while (true) {
			System.out.println("----------------MENU----------------");
			System.out.println("1 - Cadastro de embalagens");
			System.out.println("2 - Estoque de embalagens");
			System.out.println("3 - Volume de todas as embalagens");
			System.out.println("0 - Sair");
			System.out.println("");
			System.out.println("Digite a opcao: ");
			int opcaoGeral = input.nextInt();
			switch (opcaoGeral) {
			case 1:

				while (true) {
					System.out.println();
					System.out.println("----------MENU DE CADASTRO----------");
					System.out.println("1 - Cadastrar embalagem do correio");
					System.out.println("2 - Cadastrar embalagem de pizza");
					System.out.println("3 - Cadastrar embalagem de bebida");
					System.out.println("0 - Sair");
					System.out.println("");
					System.out.println("Digite a opcao: ");
					int opcaoCadastro = input.nextInt();

					switch (opcaoCadastro) {
					case 1:
						String codigoCorreio;
						double alturaCorreio;
						double comprimentoCorreio;
						double larguraCorreio;
						double volumeCorreio;
						int continuarCorreio;
						int countCorreio = 0;
						while (true) {
							if (countCorreio == 1) {
								countCorreio = 0;
								break;
							}
							System.out.println("Digite o codigo da embalagem do correio: ");
							codigoCorreio = input.next();
							System.out.println("Digite a altura da embalagem do correio: ");
							alturaCorreio = input.nextDouble();
							System.out.println("Digite o comprimento da embalagem do correio: ");
							comprimentoCorreio = input.nextDouble();
							System.out.println("Digite o largura da embalagem do correio: ");
							larguraCorreio = input.nextDouble();

							volumeCorreio = (((larguraCorreio * comprimentoCorreio * alturaCorreio) / 1000) / 1000) / 1000;
							somaTotal += volumeCorreio;
							somaTotalCorreio += volumeCorreio;
							Embalagem_Correio correio = new Embalagem_Correio(codigoCorreio, alturaCorreio, comprimentoCorreio, larguraCorreio, volumeCorreio);
							listaCorreio.add(correio);

							while (true) {

								System.out.println("Deseja continuar? 1 = continuar, 0 = sair");
								continuarCorreio = input.nextInt();

								if (continuarCorreio == 1) {
									break;
								} else if (continuarCorreio == 0) {
									countCorreio++;
									break;
								} else {
									System.out.println("Opcao errada!!! \n Digite Novamente");
								}
							}
						}
						break;
					case 2:
						String codigoPizza;
						double alturaPizza;
						double ladoPizza;
						double volumePizza;
						int continuarPizza;
						int countPizza = 0;
						while (true) {
							if (countPizza == 1) {
								countPizza = 0;
								break;
							}
							System.out.println("Digite o codigo da embalagem de Pizza: ");
							codigoPizza = input.next();
							System.out.println("Digite a altura da embalagem de Pizza: ");
							alturaPizza = input.nextDouble();
							System.out.println("Digite o lado da embalagem de Pizza: ");
							ladoPizza = input.nextDouble();

							double areaBase = 2 * (1 + (Math.sqrt(2))) * (ladoPizza * ladoPizza);
							volumePizza = (((areaBase * alturaPizza) / 1000) / 1000) / 1000;
							somaTotal += volumePizza;
							somaTotalPizza += volumePizza;
							Embalagem_Pizza pizza = new Embalagem_Pizza(codigoPizza, alturaPizza, ladoPizza, volumePizza);
							listaPizza.add(pizza);

							while (true) {

								System.out.println("Deseja continuar? 1 = continuar, 0 = sair");
								continuarPizza = input.nextInt();

								if (continuarPizza == 1) {
									break;
								} else if (continuarPizza == 0) {
									countPizza++;
									break;
								} else {
									System.out.println("Opcao errada!!! \n Digite Novamente");
								}
							}
						}
						break;
					case 3:

						String codigoBebida;
						double alturaBebida;
						double diametroBebida;
						double volumeBebida;
						double Pi = 3.14159;
						int continuarBebida;
						int countBebida = 0;
						while (true) {
							if (countBebida == 1) {
								countBebida = 0;
								break;
							}
							System.out.println("Digite o codigo da embalagem de bebida: ");
							codigoBebida = input.next();
							System.out.println("Digite a altura da embalagem de bebida: ");
							alturaBebida = input.nextDouble();
							System.out.println("Digite o diâmetro da embalagem de bebida: ");
							diametroBebida = input.nextDouble();

							volumeBebida = ((((Pi * ((diametroBebida / 2) * (diametroBebida / 2))) * alturaBebida) / 1000) / 1000) / 1000;
							somaTotal += volumeBebida;
							somaTotalBebida += volumeBebida;
							Embalagem_Bebida bebida = new Embalagem_Bebida(codigoBebida, alturaBebida, diametroBebida, volumeBebida);
							listaBebida.add(bebida);

							while (true) {

								System.out.println("Deseja continuar? 1 = continuar, 0 = sair");
								continuarBebida = input.nextInt();

								if (continuarBebida == 1) {
									break;
								} else if (continuarBebida == 0) {
									countBebida++;
									break;
								} else {
									System.out.println("Opcao errada!!! \n Digite Novamente");
								}
							}
						}
						break;
					case 0:
						countCadastro++;
						break;
					default:
						System.out.println("Opcao errada!!! \n Digite Novamente");
						break;
					}
					if (countCadastro == 1) {
						break;
					}
				}
				break;
			case 2:

				while (true) {
					System.out.println();
					System.out.println("----------MENU DE CADASTRO----------");
					System.out.println("1 - Estoque da embalagem do correio");
					System.out.println("2 - Estoque da embalagem de pizza");
					System.out.println("3 - Estoque da embalagem de bebida");
					System.out.println("0 - Sair");
					System.out.println("");
					System.out.println("Digite a opcao: ");
					int opcaoEstoque = input.nextInt();

					switch (opcaoEstoque) {
					case 1:

						Collections.reverse(listaCorreio);

						System.out.println("Lista em ordem decrescente de embalgens do correios:");
						for (int i = 0; i < listaCorreio.size(); i++) {
							System.out.println("Codigo: " + listaCorreio.get(i).getCodigoCorreio());
							System.out.println("Altura: " + listaCorreio.get(i).getAlturaCorreio() + " mm");
							System.out.println("Comprimento: " + listaCorreio.get(i).getComprimentoCorreio() + " mm");
							System.out.println("Largura: " + listaCorreio.get(i).getLarguraCorreio() + " mm");
							System.out.println("Volume: " + listaCorreio.get(i).getVolumeCorreio() + " m³");
							System.out.println("-------------------------------------------------");
						}
						break;
					case 2:

						Collections.reverse(listaPizza);

						System.out.println("Lista em ordem decrescente de embalgens de Pizzas:");
						for (int i = 0; i < listaPizza.size(); i++) {
							System.out.println("Codigo: " + listaPizza.get(i).getCodigoPizza());
							System.out.println("Altura: " + listaPizza.get(i).getAlturaPizza() + " mm");
							System.out.println("Comprimento: " + listaPizza.get(i).getLadoPizza() + " mm");
							System.out.println("Volume: " + listaPizza.get(i).getVolumePizza() + " m³");
							System.out.println("-------------------------------------------------");
						}
						break;
					case 3:

						Collections.reverse(listaBebida);

						System.out.println("Lista em ordem decrescente de embalgens de bebidas:");
						for (int i = 0; i < listaPizza.size(); i++) {
							System.out.println("Codigo: " + listaBebida.get(i).getCodigoBebida());
							System.out.println("Altura: " + listaBebida.get(i).getAlturaBebida() + " mm");
							System.out.println("Comprimento: " + listaBebida.get(i).getDiametroBebida() + " mm");
							System.out.println("Volume: " + listaBebida.get(i).getVolumeBebida() + " m³");
							System.out.println("-------------------------------------------------");
						}
						break;
					case 0:
						countEstoque++;
						break;
					default:
						System.out.println("Opcao errada!!! \n Digite Novamente");
						break;
					}
					if (countEstoque == 1) {
						break;
					}
				}
				break;
			case 3:
				System.out.println("-------------------------------------------------");
				System.out.println("Soma total do volume das embalagens do correio: " + somaTotalCorreio + " m³");
				System.out.println("-------------------------------------------------");
				System.out.println("Soma total do volume das embalagens de pizza: " + somaTotalPizza + " m³");
				System.out.println("-------------------------------------------------");
				System.out.println("Soma total do volume das embalagens de bebida: " + somaTotalBebida + " m³");
				System.out.println("-------------------------------------------------");
				System.out.println("Soma total do volume de todas embalagens: " + somaTotal + " m³");
				System.out.println("-------------------------------------------------");
				break;
			case 0:
				countGeral++;
				break;
			default:
				System.out.println("Opcao errada!!! \n Digite Novamente");
				break;
			}
			if (countGeral == 1) {
				break;
			}
		}
		input.close();
	}
}
