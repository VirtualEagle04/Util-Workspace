package view;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import controller.Controller;

public class GameState extends JPanel {

	private Controller c;
	private JLabel[] celdas;
	private JLayeredPane tablero;
	private int[][] mazeMatrix;
	private ArrayList<Integer> mazeMap;
	private PlayerRender player;
	private EnemyRender enemy;
	private KeyRender key;

	public GameState() {
		setSize(1024, 768);
		setLocation(0, 0);
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		c = new Controller();
		mazeMap = new ArrayList<Integer>();

		tablero = new JLayeredPane();
		tablero.setBackground(Color.WHITE);
		tablero.setLayout(null);
		tablero.setSize(32 * (c.getColumns() + 2), 32 * (c.getRows() + 2));
		int mitadX = tablero.getWidth() / 2;
		int mitadY = tablero.getHeight() / 2;
		tablero.setLocation(512 - mitadX, 364 - mitadY);

		celdas = new JLabel[(c.getRows() + 2) * (c.getColumns() + 2)];
		mazeMatrix = c.getMazeMatrix();
		mazeMap = c.getMazeMap();

		int pos_X = 0;
		int pos_Y = 0;

		// Rows
		for (int i = 0; i < mazeMatrix.length; i++) {
			// Columns
			for (int j = 0; j < mazeMatrix[i].length; j++) {
				if (mazeMatrix[i][j] == 1) {

					// Last row
					if (i == mazeMatrix.length - 1) {
						celdas[i] = new JLabel(new ImageIcon("src/Assets/Wall/Top.png"));
						celdas[i].setSize(32, 32);
						celdas[i].setLocation(pos_X, pos_Y);
						pos_X += 32;
						tablero.add(celdas[i]);
					} else {
						// Top
						try {
							if (mazeMatrix[i + 1][j] == 1) {
								celdas[i] = new JLabel(new ImageIcon("src/Assets/Wall/Top.png"));
								celdas[i].setSize(32, 32);
								celdas[i].setLocation(pos_X, pos_Y);
								pos_X += 32;
								tablero.add(celdas[i]);
							}
						} catch (ArrayIndexOutOfBoundsException e) {
							celdas[i] = new JLabel(new ImageIcon("src/Assets/Wall/Top.png"));
							celdas[i].setSize(32, 32);
							celdas[i].setLocation(pos_X, pos_Y);
							pos_X += 32;
							tablero.add(celdas[i]);
						}
						// IndWall
						try {
							if (mazeMatrix[i + 1][j] != 1) {
								celdas[i] = new JLabel(new ImageIcon("src/Assets/Wall/IndWall.png"));
								celdas[i].setSize(32, 32);
								celdas[i].setLocation(pos_X, pos_Y);
								pos_X += 32;
								tablero.add(celdas[i]);
							}
						} catch (ArrayIndexOutOfBoundsException e) {
							celdas[i] = new JLabel(new ImageIcon("src/Assets/Wall/IndWall.png"));
							celdas[i].setSize(32, 32);
							celdas[i].setLocation(pos_X, pos_Y);
							pos_X += 32;
							tablero.add(celdas[i]);
						}
					}

				}
				if (mazeMatrix[i][j] == 0) {

					Random rnd = new Random();
					int temp = rnd.nextInt(((8 - 0) + 1) + 0);

					switch (temp) {
					case 0: {
						celdas[i] = new JLabel(new ImageIcon("src/Assets/Floor/floor1.png"));
						celdas[i].setSize(32, 32);
						celdas[i].setLocation(pos_X, pos_Y);
						pos_X += 32;
						tablero.add(celdas[i], JLayeredPane.DEFAULT_LAYER);
						break;
					}
					case 1: {
						celdas[i] = new JLabel(new ImageIcon("src/Assets/Floor/floor2.png"));
						celdas[i].setSize(32, 32);
						celdas[i].setLocation(pos_X, pos_Y);
						pos_X += 32;
						tablero.add(celdas[i], JLayeredPane.DEFAULT_LAYER);
						break;
					}
					case 2: {
						celdas[i] = new JLabel(new ImageIcon("src/Assets/Floor/floor3.png"));
						celdas[i].setSize(32, 32);
						celdas[i].setLocation(pos_X, pos_Y);
						pos_X += 32;
						tablero.add(celdas[i], JLayeredPane.DEFAULT_LAYER);
						break;
					}
					case 3: {
						celdas[i] = new JLabel(new ImageIcon("src/Assets/Floor/floor4.png"));
						celdas[i].setSize(32, 32);
						celdas[i].setLocation(pos_X, pos_Y);
						pos_X += 32;
						tablero.add(celdas[i], JLayeredPane.DEFAULT_LAYER);
						break;
					}
					case 4: {
						celdas[i] = new JLabel(new ImageIcon("src/Assets/Floor/floor6.png"));
						celdas[i].setSize(32, 32);
						celdas[i].setLocation(pos_X, pos_Y);
						pos_X += 32;
						tablero.add(celdas[i], JLayeredPane.DEFAULT_LAYER);
						break;
					}
					case 5: {
						celdas[i] = new JLabel(new ImageIcon("src/Assets/Floor/floor7.png"));
						celdas[i].setSize(32, 32);
						celdas[i].setLocation(pos_X, pos_Y);
						pos_X += 32;
						tablero.add(celdas[i], JLayeredPane.DEFAULT_LAYER);
						break;
					}
					case 6: {
						celdas[i] = new JLabel(new ImageIcon("src/Assets/Floor/floor8.png"));
						celdas[i].setSize(32, 32);
						celdas[i].setLocation(pos_X, pos_Y);
						pos_X += 32;
						tablero.add(celdas[i], JLayeredPane.DEFAULT_LAYER);
						break;
					}
					case 7: {
						celdas[i] = new JLabel(new ImageIcon("src/Assets/Floor/floor9.png"));
						celdas[i].setSize(32, 32);
						celdas[i].setLocation(pos_X, pos_Y);
						pos_X += 32;
						tablero.add(celdas[i], JLayeredPane.DEFAULT_LAYER);
						break;
					}
					case 8: {
						celdas[i] = new JLabel(new ImageIcon("src/Assets/Floor/floor10.png"));
						celdas[i].setSize(32, 32);
						celdas[i].setLocation(pos_X, pos_Y);
						pos_X += 32;
						tablero.add(celdas[i], JLayeredPane.DEFAULT_LAYER);
						break;
					}
					default:
					}

				}

				// LLaves y Enemigos
				if (mazeMatrix[i][j] == 2) {
					celdas[i] = new JLabel(new ImageIcon("src/Assets/Floor/floor10.png"));
					celdas[i].setSize(32, 32);
					celdas[i].setLocation(pos_X, pos_Y);
					pos_X += 32;
					tablero.add(celdas[i], JLayeredPane.DEFAULT_LAYER);

					enemy = new EnemyRender();
					enemy.setLocation(celdas[i].getLocation());
					tablero.add(enemy, JLayeredPane.MODAL_LAYER);
				}

				if (mazeMatrix[i][j] == 5) {
					celdas[i] = new JLabel(new ImageIcon("src/Assets/Floor/floor4.png"));
					celdas[i].setSize(32, 32);
					celdas[i].setLocation(pos_X, pos_Y);
					pos_X += 32;
					tablero.add(celdas[i], JLayeredPane.DEFAULT_LAYER);

					key = new KeyRender();
					key.setLocation(celdas[i].getLocation());
					tablero.add(key, JLayeredPane.MODAL_LAYER);
				}

				// Entradas y Salidas
				if (mazeMatrix[i][j] == 3) {
					celdas[i] = new JLabel(new ImageIcon("src/Assets/Wall/WallTileStart.png"));
					celdas[i].setSize(32, 32);
					celdas[i].setLocation(pos_X, pos_Y);
					pos_X += 32;
					tablero.add(celdas[i], JLayeredPane.DEFAULT_LAYER);

					player = new PlayerRender();
					player.setLocation(celdas[i].getLocation());
					tablero.add(player, JLayeredPane.MODAL_LAYER);

				}
				if (mazeMatrix[i][j] == 4) {
					celdas[i] = new JLabel(new ImageIcon("src/Assets/Wall/WallTileFinish.png"));
					celdas[i].setSize(32, 32);
					celdas[i].setLocation(pos_X, pos_Y);
					pos_X += 32;
					tablero.add(celdas[i]);
				}

				// System.out.println("Checked: "+i+","+j);
			}
			pos_X = 0;
			pos_Y += 32;
		}

		add(tablero);
	}

	public Controller getC() {
		return c;
	}

	public void setC(Controller c) {
		this.c = c;
	}

	public JLabel[] getCeldas() {
		return celdas;
	}

	public void setCeldas(JLabel[] celdas) {
		this.celdas = celdas;
	}

	public JLayeredPane getTablero() {
		return tablero;
	}

	public void setTablero(JLayeredPane tablero) {
		this.tablero = tablero;
	}

	public int[][] getMazeMatrix() {
		return mazeMatrix;
	}

	public void setMazeMatrix(int[][] mazeMatrix) {
		this.mazeMatrix = mazeMatrix;
	}

	public ArrayList<Integer> getMazeMap() {
		return mazeMap;
	}

	public void setMazeMap(ArrayList<Integer> mazeMap) {
		this.mazeMap = mazeMap;
	}

	public PlayerRender getPlayer() {
		return player;
	}

	public void setPlayer(PlayerRender player) {
		this.player = player;
	}

}
