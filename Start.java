import java.lang.*;
import java.util.*;
import classes.*;
import fileio.*;

public class Start{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		FoodCourt f = new FoodCourt();
		FileReadWriteDemo frwd = new FileReadWriteDemo();

		System.out.println("-------------------------------------------");
		System.out.println("WelCome to Food Court");
		System.out.println("-------------------------------------------\n");

		boolean repeat=true;

		while(repeat){
			System.out.println("Select your option ");
			System.out.println("\t1. Employee Management");
			System.out.println("\t2. Restaurant Management");
			System.out.println("\t3. Restaurant FoodItem Management");
			System.out.println("\t4. FoodItem Quantity Add-Sell");
			System.out.println("\t5. Exit");
			System.out.println("-------------------------------------------");
			boolean again = true;
			int choice = 0;
				while(again){
					try{
						System.out.print("Enter you choice: ");
						choice = sc.nextInt();
						System.out.println("\n\n#######################################################\n\n");
						
						again = false;
					}
					catch(InputMismatchException e){
						System.out.println("\n\n#######################################################\n\n");
						System.out.print("Inavlid option choice.Try again\n ");
						System.out.println("-------------------------------------------");
						String stop = sc.next();
					}	
				}
			switch(choice){

				case 1: 
						System.out.println("\n\n\n-------------------------------------------");
						System.out.println("You have chose Employee Management");
						System.out.println("-------------------------------------------");

						System.out.println("Select your option ");
						System.out.println("\t1. Insert New Employee");
						System.out.println("\t2. Remove Existing Employee");
						System.out.println("\t3. Show All Employees");
						System.out.println("\t4. Search a Employee");
						System.out.println("\t5. Go Back");
						System.out.println("-------------------------------------------");
						boolean again1 = true;
						int choice1 = 0;
							while(again1){
								try{
									System.out.print("Enter you choice: ");
									choice1 = sc.nextInt();
									System.out.println("\n\n#######################################################\n\n");
						
									again1 = false;
								}
								catch(InputMismatchException e){
									System.out.println("\n\n#######################################################\n\n");
									System.out.print("Inavlid option choice.Try again\n ");
									System.out.println("-------------------------------------------");
									String stop = sc.next();
								}
							}

						switch(choice1){
							case 1: 

									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("You have chose to Insert New Employee");
									System.out.println("-------------------------------------------");
							
									System.out.print("Employee  ID : ");
									String empId1 = sc.next();
									System.out.print("Employee Name : ");
									String name1 = sc.next();

									boolean again11 = true;
									double salary1 = 0;
										while(again11){
											try{
												System.out.print("Employee Salary : ");
												salary1 = sc.nextDouble ();
												again11 = false;
											}
											catch(InputMismatchException e){
												System.out.print("Inavlid Salary Inserted .Try again\n ");
												System.out.println("-------------------------------------------");
												String stop = sc.next();
											}
										}

									Employee e1 = new Employee(empId1, name1, salary1);

									if(f.insertEmployee(e1)){
										System.out.println("Employee Inserted Successfully.");
										System.out.print("Name "+ name1+ ",  Id "+ empId1);
									}
									else{System.out.println("Employee can not be created now. Try again later");}


									System.out.println("\n\n#######################################################\n\n");

								break;

							case 2 :

									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("You have chose to Remove Employee");
									System.out.println("-------------------------------------------");
							
									System.out.print("Employee  ID: ");
									String empId2 = sc.next();

									Employee e2 = f.searchEmployee(empId2);

									System.out.println("Are You sure you want to delete this Employee? ");
									System.out.print("Press 1 to delete Employee  ");

									boolean again12 = true;
									int delete = 0;
										while(again12){
											try{
												System.out.print("Press 1 to delete Employee  ");
												delete = sc.nextInt ();
												System.out.println("\n\n#######################################################\n\n");
									
												again12= false;
											}
											catch(InputMismatchException e){
												System.out.println("\n\n#######################################################\n\n");
												System.out.print("Inavlid option choice.Try again\n ");
												System.out.println("-------------------------------------------");
												String stop = sc.next();
											}
										}

									if(delete==1){

										if(e2 != null){
											if(f.removeEmployee(e2)){
												System.out.println("Employee ID " +empId2 +" Removed Successfully.");
											}
											else{System.out.println("Employee can not be removed now. Try again later");}
										}
										else{System.out.println("No Employee found.");}
									}
									else{System.out.println("Account is not deleted. Thanks for come back");}


									System.out.println("\n\n#######################################################\n\n");

								break;
							case 3: 


									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("You have chose to Show All Employee");
									System.out.println("-------------------------------------------");

									f.showAllEmployees();


									System.out.println("\n\n#######################################################\n\n");

								break;

							case 4 :

									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("You have chose to Search Employee");
									System.out.println("-------------------------------------------");
									
									System.out.print("Employee  ID: ");
									String empId4 = sc.next();

									Employee e4 = f.searchEmployee(empId4);

									if(e4!= null){
										System.out.println("\n\n---------------------------------------------------\n");
										System.out.println("Employee has been founded.");
										System.out.println("Employee ID : "+e4.getEmpId());
										System.out.println("Employee Name : "+e4.getName());
										System.out.println("Employee Salary : "+e4.getSalary());
										System.out.println("\n---------------------------------------------------\n");
									}
									else{System.out.println("No Employee found.");}


									System.out.println("\n\n#######################################################\n\n");

								break;

							case 5: 
									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("Going Back to the main menu...............");
									System.out.println("-------------------------------------------");


									System.out.println("\n\n#######################################################\n\n");

								break;

							default :

									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("Invalid option . Try again...............");
									System.out.println("-------------------------------------------");


									System.out.println("\n\n#######################################################\n\n");

						
								break;
						}

					break;

				case 2 :

						System.out.println("\n\n-------------------------------------------");
						System.out.println("You have chose Restaurant Management");
						System.out.println("-------------------------------------------");

						System.out.println("Select your option ");
						System.out.println("\t1. Insert New Restaurant");
						System.out.println("\t2. Remove Existing Restaurant");
						System.out.println("\t3. Show All Restaurants");
						System.out.println("\t4. Search a Restaurant");
						System.out.println("\t5. Go Back");
						System.out.println("-------------------------------------------");
						boolean again2 = true;
						int choice2 = 0;
							while(again2){
								try{
									System.out.print("Enter you choice: ");
									choice2 = sc.nextInt();
									System.out.println("\n\n#######################################################\n\n");
						
									again2 = false;
								}
								catch(InputMismatchException e){
									System.out.println("\n\n#######################################################\n\n");
									System.out.print("Inavlid option choice.Try again\n ");
									System.out.println("-------------------------------------------");
									String stop = sc.next();
								}
							}


						switch(choice2){
							case 1: 

									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("You have chose to Insert New Restaurant");
									System.out.println("-------------------------------------------");
							
									System.out.print("Restaurant  ID: ");
									String rid1 = sc.next();
									System.out.print("Restaurant Name: ");
									String name1 = sc.next();

									Restaurant r1 = new Restaurant(rid1, name1);

									if(f.insertRestaurant(r1)){
										System.out.print("Restaurant Inserted Successfully.");
										System.out.print("Name "+ name1+ ",  Id  "+rid1);
									}
									else{System.out.println("Restaurant can not be created now. Try again later");}

									System.out.println("\n\n#######################################################\n\n");

								break;

							case 2 :

									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("You have chose to Remove Restaurant");
									System.out.println("-------------------------------------------");
							
									System.out.print("Restaurant  ID: ");
									String rid2 = sc.next();

									Restaurant r2 = f.searchRestaurant(rid2);

									System.out.println("Are You sure you want to delete this Restaurant? ");
									boolean again22 = true;
									int delete22 = 0;
										while(again22){
											try{
												System.out.print("Press 1 to delete Restaurant ");
												delete22 = sc.nextInt ();
												System.out.println("\n\n#######################################################\n\n");
									
												again22 = false;
											}
											catch(InputMismatchException e){
												System.out.println("\n\n#######################################################\n\n");
												System.out.print("Inavlid option choice.Try again\n ");
												System.out.println("-------------------------------------------");
												String stop = sc.next();
											}
										}

									if(delete22==1){

										if(r2 != null){
											if(f.removeRestaurant(r2)){
												System.out.print("Restaurant ID " + rid2+ " Removed Successfully.");
											}
											else{System.out.println("Restaurant can not be removed now. Try again later");}
										}
										else{System.out.println("No Restaurant found.");}
									}
									else{System.out.println("Account is not deleted. Thanks for come back");}
									System.out.println("\n\n#######################################################\n\n");

								break;
							case 3: 

									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("You have chose to Show All Restaurant");
									System.out.println("-------------------------------------------");

									f.showAllRestaurants();

									System.out.println("\n\n#######################################################\n\n");

								break;

							case 4 :

									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("You have chose to Search Restaurant");
									System.out.println("-------------------------------------------");
									
									System.out.print("Restaurant  ID: ");
									String rid4 = sc.next();

									Restaurant r4 = f.searchRestaurant(rid4);

									if(r4!= null){
										System.out.println("Restaurant has been founded.");
										System.out.println("---------------------------------------------");
										System.out.println("Restaurant ID : "+r4.getRid());
										System.out.println("Restaurant Name : "+r4.getName());
										System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
										r4.showAllFoodItems();
										System.out.println("---------------------------------------------");
									}
									else{System.out.println("No Restaurant found.");}
									System.out.println("\n\n#######################################################\n\n");

								break;

							case 5: 
									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("Going Back to the main menu...............");
									System.out.println("-------------------------------------------");
									System.out.println("\n\n#######################################################\n\n");

								break;

							default :

									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("Invalid option . Try again...............");
									System.out.println("-------------------------------------------");
									System.out.println("\n\n#######################################################\n\n");

						
								break;
						}

					break;

				case 3: 

						System.out.println("\n\n-------------------------------------------");
						System.out.println("You have chose Restaurant FoodItem Management");
						System.out.println("-------------------------------------------");

						System.out.println("Select your option ");
						System.out.println("\t1. Insert New Food Item");
						System.out.println("\t2. Remove Existing Food Item");
						System.out.println("\t3. Show All Food Item");
						System.out.println("\t4. Search a Food Item");
						System.out.println("\t5. Go Back");
						System.out.println("-------------------------------------------");
						boolean again3 = true;
						int choice3 = 0;
							while(again3){
								try{
									System.out.print("Enter you choice: ");
									choice3 = sc.nextInt();
									System.out.println("\n\n#######################################################\n\n");
						
									again3 = false;
								}
								catch(InputMismatchException e){
									System.out.println("\n\n#######################################################\n\n");
									System.out.print("Inavlid option choice.Try again\n ");
									System.out.println("-------------------------------------------");
									String stop = sc.next();
								}
							}



						switch(choice3){

							case 1: 
									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("You have choose to Insert New Food Items");
									System.out.println("-------------------------------------------\n");

									System.out.print("Restaurant ID: ");
									String rid3 = sc.next();

									if(f.searchRestaurant(rid3) != null){

										System.out.println("Which types of food do you want to insert ?");
										System.out.println("\t1. Main Dish");
										System.out.println("\t2. Appitizers");
										System.out.println("\t3. Go Back");
								
										boolean again311 = true;
										int choice311 = 0;
											while(again311){
												try{
													System.out.print("Enter Food Type: ");
													choice311 = sc.nextInt ();
													System.out.println("\n\n#######################################################\n\n");
										
													again311 = false;
												}
												catch(InputMismatchException e){
													System.out.println("\n\n#######################################################\n\n");
													System.out.print("Inavlid Food Type choice.Try again\n ");
													System.out.println("-------------------------------------------");
													String stop = sc.next();
												}
											}

										switch(choice311){
											case 1: 
													
													System.out.println("\n\n#######################################################\n\n");
													System.out.print("Food Id : ");
													String fid31 = sc.next();

													System.out.print("Food Name: ");
													String name31 = sc.next();

													boolean again3111 = true;
													int availableQuantity31 = 0;
														while(again3111){
															try{
																System.out.print("Available Quantity : ");
																availableQuantity31 = sc.nextInt();
																again3111 = false;
															}
															catch(InputMismatchException e){
																System.out.println("\n\n#######################################################\n\n");
																System.out.print("Inavlid Available Quantity.Try again\n ");
																System.out.println("-------------------------------------------");
																String stop = sc.next();
															}
														}

									

													boolean again3112 = true;
													double price31 = 0;
														while(again3112){
															try{
																System.out.print("Food Price : ");
																price31 = sc.nextDouble();
																again3112 = false;
															}
															catch(InputMismatchException e){
																System.out.println("\n\n#######################################################\n\n");
																System.out.print("Inavlid Food Price.Try again\n ");
																System.out.println("-------------------------------------------");
																String stop = sc.next();
															}
														}
									
													System.out.print("Food Category : ");
													String category31 = sc.next();

													FoodItem m31 = new MainDish(fid31,name31,availableQuantity31 ,price31, category31 );
													
													if(f.searchRestaurant(rid3).insertFoodItem(m31))
													{
														System.out.println("Food Id Number "+ fid31 +" inserted for "+ rid3);
													}
													else
													{
														System.out.println("Food Item Can Not be inserted");
													}

													System.out.println("\n\n#######################################################\n\n");
													

												break;

											case 2 :

													
													
													System.out.println("\n\n#######################################################\n\n");
													System.out.print("Food Id : ");
													String fid32 = sc.next();

													System.out.print("Food Name: ");
													String name32 = sc.next();

													boolean again3121 = true;
													int availableQuantity32 = 0;
														while(again3121){
															try{
																System.out.print("Available Quantity : ");
																availableQuantity32 = sc.nextInt();
																again3121 = false;
															}
															catch(InputMismatchException e){
																System.out.print("Inavlid Available Quantity.Try again\n ");
																System.out.println("-------------------------------------------");
																String stop = sc.next();
															}
														}

									

													boolean again3122 = true;
													double price32 = 0;
														while(again3122){
															try{
																System.out.print("Food Price : ");
																price32 = sc.nextDouble();
																again3122 = false;
															}
															catch(InputMismatchException e){
																System.out.println("\n\n#######################################################\n\n");
																System.out.print("Inavlid Food Price .Try again\n ");
																System.out.println("-------------------------------------------");
																String stop = sc.next();
															}
														}
									
													System.out.print("Food Size : ");
													String size32 = sc.next();

													FoodItem m32 = new Appetiziers(fid32,name32, availableQuantity32 ,price32, size32  );

													if(f.searchRestaurant(rid3).insertFoodItem(m32))
													{
														System.out.println("Food Id Number "+ fid32 +" inserted for "+ rid3);
													}
													else
													{
														System.out.println("Food Item Can Not be inserted");
													}

													System.out.println("\n\n#######################################################\n\n");
													

												break;

											case 3: 
													
													System.out.println("\n\n#######################################################\n\n");
													System.out.println("-------------------------------------------");
													System.out.println("Going Back to the main menu...............");
													System.out.println("-------------------------------------------");
													System.out.println("\n\n#######################################################\n\n");
													

												break;

											default: 

													
													System.out.println("\n\n#######################################################\n\n");
													System.out.println("-------------------------------------------");
													System.out.println("Invalid option . Try again...............");
													System.out.println("-------------------------------------------");
													System.out.println("\n\n#######################################################\n\n");
													

												break;
											}
										}

									else{System.out.println("Food Id does not match. Try again.");}

												
								break;
			
							case 2 :

									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("You have choose to Remove Food Items");
									System.out.println("-------------------------------------------\n\n");

									System.out.print("Restaurant ID: ");
									String rid322 = sc.next();

									if(f.searchRestaurant(rid322) != null){
									Restaurant r322 = f.searchRestaurant(rid322);
									System.out.print("Food Item  ID: ");
									String fid322 = sc.next();

									FoodItem f322 = r322.searchFoodItem(fid322);

										if(f322!= null){
											System.out.println("Are You sure you want to delete this Food Item? ");
											

											boolean again32 = true;
											int delete32 = 0;
												while(again32){
													try{
														System.out.print("Press 1 to delete Restaurant ");
														delete32 = sc.nextInt ();
														System.out.println("\n\n#######################################################\n\n");
											
														again32 = false;
													}
													catch(InputMismatchException e){
														System.out.println("\n\n#######################################################\n\n");
														System.out.print("Inavlid option choice.Try again\n ");
														System.out.println("-------------------------------------------");
														String stop = sc.next();
													}
												}

											if(delete32==1){
												if(r322.removeFoodItem(f322)){
													System.out.print("Food Item Removed Successfully.");
												}
												else{System.out.println("Food Item can not be removed now. Try again later");}
												}
										
											else{System.out.println("Account is not deleted. Thanks for come back");}
											}
										else{System.out.println("No Food Item found.");}
									}
									else{System.out.println("No Restaurant found.");}


									System.out.println("\n\n#######################################################\n\n");
													
									break;

							case 3: 

									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("You have chose to Show All Food Item");
									System.out.println("-------------------------------------------\n\n");


									System.out.print("Restaurant  ID: ");
									String rid332 = sc.next();

									Restaurant r332 = f.searchRestaurant(rid332);

									if(f.searchRestaurant(rid332)!=null){
									System.out.println("Restaurant has been founded.");
									r332.showAllFoodItems();
									}

									else{System.out.println("No Restaurant found.");}
									System.out.println("\n\n#######################################################\n\n");

								break;
			
							case 4 : 

									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("You have chose to Search Food Item");
									System.out.println("-------------------------------------------\n\n");
									
									System.out.print("Restaurant ID: ");
									String rid44 = sc.next();

									if(f.searchRestaurant(rid44) != null){
									Restaurant r44 = f.searchRestaurant(rid44);
									System.out.print("Food Item  ID: ");
									String fid44 = sc.next();

									FoodItem f44 = r44.searchFoodItem(fid44);

									if(f44!= null){
										System.out.println("FoodItem has been founded.");
										System.out.println("\n-------------------------------------------\n");
										r44.showAllFoodItems();
										System.out.println("\n-------------------------------------------\n");
									}
									else{System.out.println("No FoodItem found.");}
									}

									else{System.out.println("No Restaurant found.");}

									System.out.println("\n\n#######################################################\n\n");
			
								break;
							case 5: 
									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("Going Back to the main menu...............");
									System.out.println("-------------------------------------------");
									System.out.println("\n\n#######################################################\n\n");
			
								break;
			
							default :

									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("Invalid option . Try again...............");
									System.out.println("-------------------------------------------");
									System.out.println("\n\n#######################################################\n\n");
			
								break;
						}



					break;

				case 4 :
						System.out.println("-------------------------------------------");
						System.out.println("You have chose FoodItem Quantity Add-Sell");
						System.out.println("-------------------------------------------");

						System.out.println("Select your option ");
						System.out.println("\t1. Add  Food Item");
						System.out.println("\t2. Sell  Food Item");
						System.out.println("\t3. Show Add Sell History");
						System.out.println("\t4. Go Back");
						System.out.println("-------------------------------------------");
						boolean again4 = true;
						int choice4 = 0;
							while(again4){
								try{
									System.out.print("Enter you choice: ");
									choice4 = sc.nextInt();
									System.out.println("\n\n#######################################################\n\n");
						
									again4 = false;
								}
								catch(InputMismatchException e){
									System.out.println("\n\n#######################################################\n\n");
									System.out.print("Inavlid option choice.Try again\n ");
									System.out.println("-------------------------------------------");
									String stop = sc.next();
								}
							}

						switch(choice4){
							case 1: 
								System.out.println("\n\n#######################################################\n\n");
								System.out.println("-------------------------------------------");
								System.out.println("You have chose to Add Food Item");
								System.out.println("-------------------------------------------");

								System.out.print("Enter Restaurant ID: ");
								
								String rid411 = sc.next();

								if(f.searchRestaurant(rid411) != null){

									System.out.print("Enter Food Item ID: ");
								
									String fid411 = sc.next();

									if(f.searchRestaurant(rid411).searchFoodItem(fid411) != null){


									boolean again41 = true;
									int amount1 = 0;
										while(again41){
											try{
												System.out.print("Add Food Item : ");
												amount1 = sc.nextInt();
												again41 = false;
											}
											catch(InputMismatchException e){
												System.out.println("\n\n#######################################################\n\n");
												System.out.print("Unable to add Food Item.Try again\n ");
												System.out.println("-------------------------------------------");
												String stop = sc.next();
											}
										}


										if(f.searchRestaurant(rid411).searchFoodItem(fid411).addQuantity(amount1)){

										System.out.println("Food Amount Added ....");
										frwd.writeInFile("Amount : " +amount1 + "  added in "+ fid411+ " by "+ rid411);
										}
										else{System.out.println("Can Not Added");}
									}
									else{System.out.println("Invalid Food Item Id Number");}

								}
								else{System.out.println("Restaurant ID  does not MISMATCH");}
								System.out.println("\n\n#######################################################\n\n");


								break;

							case 2 : 
								System.out.println("\n\n#######################################################\n\n");
								System.out.println("-------------------------------------------");
								System.out.println("You have chose to Sell Food Item");
								System.out.println("-------------------------------------------");

								System.out.print("Enter Restaurant ID: ");
								
								String rid412 = sc.next();

								if(f.searchRestaurant(rid412) != null){

									System.out.print("Enter Food Item ID: ");
								
									String fid412 = sc.next();

									if(f.searchRestaurant(rid412).searchFoodItem(fid412) != null){



									boolean again42 = true;
									int amount2 = 0;
										while(again42){
											try{
												System.out.print("Sell Food Item : ");
												amount2 = sc.nextInt();
												again42 = false;
											}
											catch(InputMismatchException e){
												System.out.println("\n\n#######################################################\n\n");
												System.out.print("Unable to sell Food Item.Try again\n ");
												System.out.println("-------------------------------------------");
												String stop = sc.next();
											}
										}
										if(f.searchRestaurant(rid412).searchFoodItem(fid412).sellQuantity(amount2)){

										System.out.println("Food Item Selled ....");
										frwd.writeInFile("Amount : " +amount2 + "Selled in "+ fid412+ " by "+ rid412);
										}
										else{System.out.println("Can Not Selled");}
									}
									else{System.out.println("Invalid Food Item Id Number");}

								}
								else{System.out.println("Restaurant ID  does not MISMATCH");}

								break;
							case 3: 
								System.out.println("\n\n#######################################################\n\n"); 
								System.out.println("-------------------------------------------");
								System.out.println("You have chose to Show ADD SELL History");
								System.out.println("-------------------------------------------");

								frwd.readFromFile();
								System.out.println("\n\n#######################################################\n\n");

								break;

							case 4 :
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("Going Back to the main menu...............");
									System.out.println("-------------------------------------------");
									System.out.println("\n\n#######################################################\n\n");

								break;

							default :

									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("Invalid option . Try again...............");
									System.out.println("-------------------------------------------");
									System.out.println("\n\n#######################################################\n\n");


								break;
							}			

					break;
				case 5: 
						
						System.out.println("\n\n#######################################################\n\n");
						repeat=false;
						System.out.println("-------------------------------------------");
						System.out.println("Thanks for being with us...............");
						System.out.println("-------------------------------------------");
						System.out.println("\n\n#######################################################\n\n");
						
					break;

				default :

						
						System.out.println("\n\n#######################################################\n\n");
						System.out.println("-------------------------------------------");
						System.out.println("Invalid option . Try again...............");
						System.out.println("-------------------------------------------");
						System.out.println("\n\n#######################################################\n\n");


					break;

			}

		}
	}
}
