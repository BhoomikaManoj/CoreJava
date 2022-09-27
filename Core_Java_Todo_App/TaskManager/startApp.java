package com.uttara.TaskManager;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class startApp {

	public static void main(String[] args) {
		try {

			Scanner sc1 = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);

			Logger.getInstance().log("Starting TaskManger...");
			TaskModel model = new TaskModel();

			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

			int ch1 = 0, ch2 = 0, ch3 = 0;
			String categoryName;
			String taskName;
			String desc;
			String tags;
			String endDate;
			int priority;
			File fileName;

			while (ch1 != 5) {
				System.out.println("Press 1 to Create Category");
				System.out.println("Press 2 to Load Category");
				System.out.println("Press 3 to Search");
				System.out.println("Press 4 to List");
				System.out.println("Press 5 to Exit");
				System.out.println("Enter choice: ");
				ch1 = sc1.nextInt();

				switch (ch1) {

				case 1:
					System.out.println("Creating Category...");
					System.out.println("Enter Category name");
					categoryName = sc2.nextLine();

					//
					while (!TaskUtil.validateName(categoryName)) {
						System.out
								.println("Category Name must be single word, start with letter, only alphanumeric...");
						System.out.println("Enter another Category Name ");
						categoryName = sc2.nextLine();
					}

					// business validation check if the category name exists or not
					if (model.checkCategoryExists(categoryName)) {
						System.out.println("your enter Duplicate Category Name, please enter unique Category Name");
					} else {
						while (ch2 != 6) {
							System.out.println("Press 1 to Add a Task");
							System.out.println("Press 2 to Update/Edit a Task");
							System.out.println("Press 3 to Remove a Task");
							System.out.println("Press 4 to List the Tasks");
							System.out.println("Press 5 to Search");
							System.out.println("Press 6 to Go back");
							ch2 = sc1.nextInt();

							fileName = new File(Constants.PATH + "/" + categoryName + ".todo");

							switch (ch2) {
							case 1:
								Logger.getInstance().log("Creating task");
								System.out.println("Enter task name");
								taskName = sc2.nextLine();
								while (!TaskUtil.ValidateTaskName(taskName)) {
									System.out.println("Task Name must start with letter, and alphanumeric...");
									System.out.println("Enter another Task Name ");
									taskName = sc2.nextLine();
								}
								System.out.println("Enter Description");
								desc = sc2.nextLine();

								System.out.println("Enter tag(comma separated)");
								tags = sc2.nextLine();

								System.out.println("Enter task deadline date. format dd/mm/yyyy");
								endDate = sc2.nextLine();

								System.out.println("Enter priority");
								priority = sc1.nextInt();

								Date ed = sdf.parse(endDate);
								Date d = new Date();
								String currentDate = sdf.format(d);
								Date cd = sdf.parse(currentDate);

								TaskBean bean = new TaskBean(taskName, desc, tags, cd, priority, ed);

								String result = model.addTask(bean, categoryName);
								if (result.equals(Constants.SUCCESS))
									System.out.println("Task " + taskName + " got added successfully");
								else
									System.out.println("task add unsuccessfully : " + result);

								break;
							case 2:
//								edit task
								System.out.println(fileName + "-------------");

								System.out.println("List tasks");
								System.out.println(model.listTask(fileName));

								System.out.println("Enter the name of task to you want to edit");
								String editTask = sc2.nextLine();

								Logger.getInstance().log("edit task = " + editTask);
								if (!model.isTaskExists(editTask, fileName)) {
									System.out.println(
											"Task name '" + editTask + "' does Not exist in this category to edit");
									break;
								} else {
									System.out.println(
											"Enter what you want you edit in task:(name,desc,endDate,priority,tags)(NOTE: we canot undo, and previous data will longer present in particular field of task)");
									String name = sc2.nextLine();
									Logger.getInstance().log("wanted to edit =" + name);
									System.out.println("what you want to edit with:");
									String newDetails = sc2.nextLine();
									Logger.getInstance().log("to what it got editted=" + newDetails);
									String msg2 = model.editTaskContent(name, newDetails, editTask, fileName);
									if (msg2.equals(Constants.SUCCESS))
										System.out.println("Task name '" + editTask + "' --> '" + name
												+ "' is updated to " + newDetails);
									else
										System.out.println("task name '" + editTask + "' is not Updated");
								}

								break;
							case 3:
//								remove task
								System.out.println("Enter the Name of Task you want to remove : ");
								String deleteName = sc2.nextLine();
								Logger.getInstance().log("what thak want to delete = " + deleteName);
								if (!model.isTaskExists(deleteName, fileName)) {
									System.out.println(
											"Task name '" + deleteName + "' does Not exist in the category to delete");
									break;
								} else {
									String msg1 = model.deleteTask(deleteName, fileName);
									if (msg1.equals(Constants.SUCCESS))
										System.out.println("Task name = '" + deleteName + "' removed sucessfully");
									else
										System.out.println("Task name = '" + deleteName + "' NOT deleted sucessfully");
								}

								break;
							case 4:
//								list task

								System.out.println("Enter Category Name to list task ");
								categoryName = sc2.nextLine();

								if (!model.checkCategoryExists(categoryName)) {
									System.out.println("enter existed Category Name");
								} else {
									fileName = new File(Constants.PATH + "/" + categoryName + ".todo");
									while (ch3 != 4) {
										System.out.println("Please enter HOW you want to List:");

										System.out.println("Press 1 to list tasks by alphabetical listing by name!");
										System.out.println("Press 2 to list tasks by due date!");
										System.out.println("Press 3 to list tasks by created date!");
										System.out.println("Press 4 to list tasks by longest time!");
										System.out.println("Press 5 to go back to main");
										ch3 = sc1.nextInt();

										List<TaskBean> tasks = model.listTask(fileName);
										switch (ch3) {
										case 1:
											tasks = model.listByAlphabetically(tasks);
											break;
										case 2:
											tasks = model.listByDueDate(tasks);
											break;
										case 3:
											tasks = model.listByCreatedDate(tasks);
											break;
										case 4:
											tasks = model.listLongestTime(tasks);
											break;
										case 5:
											System.out.println("go back");
											break;
										}
										for (TaskBean taskBean : tasks) {
											Logger.getInstance().log("Printing task  " + taskBean);
											System.out.println(" Task Name = " + taskBean.getTaskName() + " : "
													+ " Task desc = " + taskBean.getDesc() + " : " + " Start date is = "
													+ taskBean.getStartDate() + " : " + " End date is = "
													+ taskBean.getEndDate() + " : " + " priority of task is "
													+ taskBean.getPriority() + " : " + " tags are = "
													+ taskBean.getTags());
											System.out.println("");
										}
									}
								}
								break;

//								System.out.println("List tasks");
//								List list = model.listTask(fileName);
//								Iterator it = list.iterator();
//								while (it.hasNext()) {
////									System.out.println((String)it);
//									System.out.println(it.next());
//								}

//								break;
							case 5:
								System.out.println("Enter the tag that you want to search:");
								String searchKey = sc2.nextLine();
								Logger.getInstance().log("searching key=" + searchKey);
								System.out.println("Searching......");
								List<TaskBean> tasks1 = model.searchInTasks(searchKey, fileName);
								for (TaskBean taskBean : tasks1) {
									Logger.getInstance().log("Printing task  " + taskBean);
									System.out.println(" Task Name = " + taskBean.getTaskName() + " : "
											+ " Task desc = " + taskBean.getDesc() + " : " + " Start date is = "
											+ taskBean.getEndDate() + " : " + " status of task = "
											+ " priority of task is " + taskBean.getPriority() + " : " + " tags are = "
											+ taskBean.getTags());
									System.out.println("");
								}
								if (tasks1.isEmpty()) {
									System.out.println("Searching key : '" + searchKey + "' not found!!!");
								}

								break;
							case 6:
								System.out.println("Going back");
								break;
							default:
								System.out.println("Enter 1 to 6 numbers only");

							}

						}
						ch2 = 0;
					}

					break;
				case 2:
					if (!Constants.PATH.isEmpty()) {
						System.out.println("Category list:");
						List<String> categoryList = TaskModel.listCategory();
						for (String string : categoryList) {
							System.out.println(" * " + string);
						}
						System.out.println("Enter the name of Category you want to load(Note:don't add '.todo')");
						categoryName = sc2.nextLine();
						Logger.getInstance().log(" category name in loading = " + categoryName);
						if (model.checkCategoryExists(categoryName)) {
							System.out.println(" Category name exisits");
						} else {
							System.out.println(" Category " + categoryName + " is loaded.....!!!");
							fileName = TaskUtil.createFile(categoryName);
							Logger.getInstance().log("New File path is" + fileName);
							System.out.println("file name is '" + categoryName + "' and stored in :" + fileName);
						}

						fileName = new File(Constants.PATH + "/" + categoryName + ".todo");

						while (ch2 != 6) {
							/*
							 * Give Options for user to add task,edit,remove,list,search,goback check
							 * whether any task exists in category before doing edit,remove,list,search
							 */
							System.out.println("Press 1 to add task");
							System.out.println("Press 2 to edit task");
							System.out.println("Press 3 to remove task");
							System.out.println("Press 4 to list the task");
							System.out.println("Press 5 to search");
							System.out.println("Press 6 to Go back");
							System.out.println("Enter your choice");
							ch2 = sc1.nextInt();
							Logger.getInstance().log("Choice 2=" + ch2);
							switch (ch2) {
							case 1:
//								  1)Before adding task to category check whether task already exist with same name
								System.out.println("Enter the task name");
								taskName = sc2.nextLine();

								while (!TaskUtil.ValidateTaskName(taskName)) {
									System.out.println("Task Name start with letter,  alphanumeric...");
									System.out.println("Enter another Task Name ");
									taskName = sc2.nextLine();
								}

								System.out.println("Enter Description");
								desc = sc2.nextLine();

								System.out.println("Enter tag(comma separated)");
								tags = sc2.nextLine();

								System.out.println("Enter task deadline date. format dd/mm/yyyy");
								endDate = sc2.nextLine();

								System.out.println("Enter priority");
								priority = sc1.nextInt();

								Date ed = sdf.parse(endDate);
								Date d = new Date();
								String currentDate = sdf.format(d);
								Date cd = sdf.parse(currentDate);

								TaskBean bean = new TaskBean(taskName, desc, tags, cd, priority, ed);

								String result = model.addTask(bean, categoryName);
								if (result.equals(Constants.SUCCESS)) {
									System.out.println("Task " + taskName + " got added successfully");
									Logger.getInstance().log("task added sucessfully = " + taskName);
								} else {
									System.out.println("task add unsuccessfully : " + result);
									Logger.getInstance().log("task added sucessfully = " + taskName);
								}
								break;

							case 2:
//								Edit task or update

//								fileName = new File(Constants.PATH+"/"+categoryName+".todo");
								System.out.println(fileName + "-------------");

								System.out.println("List tasks");
								System.out.println(model.listTask(fileName));

								System.out.println("Enter the name of task to you want to edit");
								String editTask = sc2.nextLine();

								Logger.getInstance().log("edit task = " + editTask);
								if (!model.isTaskExists(editTask, fileName)) {
									System.out.println(
											"Task name '" + editTask + "' does Not exist in this category to edit");
									break;
								} else {
									System.out.println(
											"Enter what you want you edit in task:(name,desc,endDate,priority,tags)(NOTE: we canot undo, and previous data will longer present in particular field of task)");
									String name = sc2.nextLine();
									Logger.getInstance().log("wanted to edit =" + name);
									System.out.println("what you want to edit with:");
									String newDetails = sc2.nextLine();
									Logger.getInstance().log("to what it got editted=" + newDetails);
									String msg2 = model.editTaskContent(name, newDetails, editTask, fileName);
									if (msg2.equals(Constants.SUCCESS))
										System.out.println("Task name '" + editTask + "' --> '" + name
												+ "' is updated to " + newDetails);
									else
										System.out.println("task name '" + editTask + "' is not Updated");
								}
								break;
							case 3:
//								remove task
								System.out.println("Enter the Name of Task you want to remove : ");
								String deleteName = sc2.nextLine();
								Logger.getInstance().log("what thak want to delete = " + deleteName);
								if (!model.isTaskExists(deleteName, fileName)) {
									System.out.println(
											"Task name '" + deleteName + "' does Not exist in the category to delete");
									break;
								} else {
									String msg1 = model.deleteTask(deleteName, fileName);
									if (msg1.equals(Constants.SUCCESS))
										System.out.println("Task name = '" + deleteName + "' removed sucessfully");
									else
										System.out.println("Task name = '" + deleteName + "' NOT deleted sucessfully");
								}
								break;
							case 4:
//								List all Task
								System.out.println("Enter Category Name to list task ");
								categoryName = sc2.nextLine();

								if (!model.checkCategoryExists(categoryName)) {
									System.out.println("enter existed Category Name");
								} else {
									fileName = new File(Constants.PATH + "/" + categoryName + ".todo");
									while (ch3 != 4) {
										System.out.println("Please enter HOW you want to List:");

										System.out.println("Press 1 to list tasks by alphabetical listing by name!");
										System.out.println("Press 2 to list tasks by due date!");
										System.out.println("Press 3 to list tasks by created date!");
										System.out.println("Press 4 to list tasks by longest time!");
										System.out.println("Press 5 to go back to main");
										ch3 = sc1.nextInt();

										List<TaskBean> tasks = model.listTask(fileName);
										switch (ch3) {
										case 1:
											tasks = model.listByAlphabetically(tasks);
											break;
										case 2:
											tasks = model.listByDueDate(tasks);
											break;
										case 3:
											tasks = model.listByCreatedDate(tasks);
											break;
										case 4:
											tasks = model.listLongestTime(tasks);
											break;
										case 5:
											System.out.println("go back");
											break;
										}
										for (TaskBean taskBean : tasks) {
											Logger.getInstance().log("Printing task  " + taskBean);
											System.out.println(" Task Name = " + taskBean.getTaskName() + " : "
													+ " Task desc = " + taskBean.getDesc() + " : " + " Start date is = "
													+ taskBean.getStartDate() + " : " + " End date is = "
													+ taskBean.getEndDate() + " : " + " priority of task is "
													+ taskBean.getPriority() + " : " + " tags are = "
													+ taskBean.getTags());
											System.out.println("");
										}
									}
								}
//								break;
								break;
							case 5:
								System.out.println("Enter the tag that you want to search:");
								String searchKey = sc2.nextLine();
								Logger.getInstance().log("searching key=" + searchKey);
								System.out.println("Searching......");
								List<TaskBean> tasks1 = model.searchInTasks(searchKey, fileName);
								for (TaskBean taskBean : tasks1) {
									Logger.getInstance().log("Printing task  " + taskBean);
									System.out.println(" Task Name = " + taskBean.getTaskName() + " : "
											+ " Task desc = " + taskBean.getDesc() + " : " + " Start date is = "
											+ taskBean.getEndDate() + " :  " + "priority of task is "
											+ taskBean.getPriority() + " : " + " tags are = " + taskBean.getTags());
									System.out.println("");
								}
								if (tasks1.isEmpty()) {
									System.out.println("Searching key : '" + searchKey + "' not found!!!");
								}
								break;
							case 6:
								System.out.println("go back");
								break;
							}

						}
					}

					break;
				case 3:
					if (!Constants.PATH.isEmpty()) {
//						search tasks based on tags.

						System.out.println("Enter the tag that you want to search:");
						String tag = sc2.nextLine();
						Logger.getInstance().log("searching key in ALL existing categories" + tag);
						List<TaskBean> al = model.searchInAllCategory(tag);
						for (TaskBean taskBean : al) {
							Logger.getInstance().log("Printing task  " + taskBean);
							System.out.println(" Task Name = " + taskBean.getTaskName() + " : " + " Task desc = "
									+ taskBean.getDesc() + " : " + " Start date is = " + taskBean.getEndDate() + " : "
									+ " End date is = " + taskBean.getEndDate() + " : " + " status of task = "
									+ " priority of task is " + taskBean.getPriority() + " : " + " tags are = "
									+ taskBean.getTags());
							System.out.println("");
						}
						if (al.isEmpty()) {
							System.out.println("Searching key : '" + tag + "' not found!!!");
						}
						break;
					} else {
						System.out.println("create Category and task before you want to search");
					}

					break;
				case 4:

					System.out.println("List All Category Name");
					TaskModel.listcategoryName(Constants.PATH);
					break;
				case 5:
					System.exit(0);
					break;
				default:
					System.out.println("Enter 1 to 5 number");

				}
			}
		} catch (Throwable t) {
			t.printStackTrace();

		}

	}

}
