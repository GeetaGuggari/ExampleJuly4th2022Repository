package com.sgtesting.pageobjectmodel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test1 {

	public Test1(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	// get user name text field's WebElement
	private WebElement username;

	public WebElement getUsername()
	{
		return username;
	}

	//WebElement for password text field
	private WebElement pwd;

	public WebElement getPassword()
	{
		return pwd;
	}

	//To click on login button
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}

	//To click on FlyPutWindow
	@FindBy(xpath="//div[text()='Getting Started Shortcuts']")
	private WebElement minimizeFlyOutWindow;

	public WebElement getFlyOutWindow()
	{
		return minimizeFlyOutWindow;
	}

	//To click on logout button
	private WebElement logoutLink;

	public WebElement getLogout()
	{
		return logoutLink;
	}

	//to click on users
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")
	private WebElement oUser;

	public WebElement getUser()
	{
		return oUser;
	}

	//to click on add user
	@FindBy(xpath="//*[@id=\'createUserDiv\']/div")
	private WebElement oNewUser;

	public WebElement getNewUser()
	{
		return oNewUser;
	}

	//WebElement for First Name textField
	private WebElement firstName;

	public WebElement firstnameTextField()
	{
		return firstName;
	}

	//WebElement for Last Name textField
	private WebElement lastName;

	public WebElement lastNameTextFiels()
	{
		return lastName;
	}

	//WebElement for Last Name textField
	private WebElement email;

	public WebElement emailTextField()
	{
		return email;
	}

	//WebElement for user name textField
	private WebElement userDataLightBox_usernameField;

	public WebElement usernameTextField()
	{
		return userDataLightBox_usernameField;
	}

	//WebElement for user password textField
	private WebElement password;

	public WebElement userPassword()
	{
		return password;
	}

	//WebElement for retype user password textField
	private WebElement passwordCopy;

	public WebElement userPasswordRetype()
	{
		return passwordCopy;
	}

	//WebElement for create user
	private WebElement userDataLightBox_commitBtn;

	public WebElement createUserButton()
	{
		return userDataLightBox_commitBtn;
	}

	//To Click on already Created User
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]")
	private WebElement existingUser;

	public WebElement existingUserClick()
	{
		return existingUser;
	}
	

	//To click on delete user button
	private WebElement userDataLightBox_deleteBtn;

	public WebElement deleteUserButton()
	{
		return userDataLightBox_deleteBtn;
	
	}
	//To click on save changes
			@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div")
			private WebElement saveChanges;

			public WebElement getSaveChanges()
			{
				return saveChanges;
			}
	//To click on tasks
		@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a")
		private WebElement tasksclick;

		public WebElement getTasks()
		{
			return tasksclick;
		}

		//To click on add new
		@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")
		private WebElement addnew;

		public WebElement addnewCustomerorProject()
		{
			return addnew;
		}

		//To click on add customer
		@FindBy(xpath="/html/body/div[14]/div[1]")
		private WebElement newCustomer;

		public WebElement newCustomer()
		{
			return newCustomer;
		}

		//To write customer name
		private WebElement customerLightBox_nameField;

		public WebElement getCustomernameTextField()
		{
			return customerLightBox_nameField;
		}


	//To click on create customer
	private WebElement customerLightBox_commitBtn;

	public WebElement createCustomer()
	{
		return customerLightBox_commitBtn;
	}

	//to click on settings button of customer
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement customerSetting;

	public WebElement customerSettingButton()
	{
		return customerSetting;
	}

	//To click on customer description
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
	private WebElement descriptionCustomer;

	public WebElement customerDescription()
	{
		return descriptionCustomer;
	}

	//To click on action button of customer
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")
	private WebElement actionCustomerButton;

	public WebElement actionButtonCustomer()
	{
		return actionCustomerButton;
	}

	//to delete customer
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")
	private WebElement deleteCustomerButton;

	public WebElement deleteCustomerButton()
	{
		return deleteCustomerButton;
	}

	//To confirm customer deletion
	private WebElement customerPanel_deleteConfirm_submitTitle;

	public WebElement deleteCustomerConfirmation()
	{
		return customerPanel_deleteConfirm_submitTitle;
	}

	//close customer 
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[1]")
	private WebElement closeCustomer;

	public WebElement closeCustomerDesc()
	{
		return closeCustomer;
	}
	
	//to create project
		@FindBy(xpath="/html/body/div[14]/div[2]")
		private WebElement newproject;

		public WebElement newProjectButton()
		{
			return newproject;
		}

		//to enter project details
		private WebElement projectPopup_projectNameField;

		public WebElement projectNameTextField()
		{
			return projectPopup_projectNameField;
		}

		//to click create project button
		@FindBy(xpath="//*[@id=\'projectPopup_commitBtn\']/div/span")
		private WebElement createProjectButton;

		public WebElement createProjectButton()
		{
			return createProjectButton;
		}

		//to click on project setting button
		@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
		private WebElement projectSettingButton;

		public WebElement projectSettingButton()
		{
			return projectSettingButton;
		}

		//to click on project action button
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
		private WebElement projectActionButton;

		public WebElement projectActionButton()
		{
			return  projectActionButton;
		}

		//to delete projrct
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")
		private WebElement deleteProjectButton;

		public WebElement deleteProjectButton()
		{
			return deleteProjectButton;
		}

		//delete project confirmation
		private WebElement projectPanel_deleteConfirm_submitTitle;

		public WebElement deleteProjectConfirmation()
		{
			return projectPanel_deleteConfirm_submitTitle;
		}

		//to write project description
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
		private WebElement projectDescription;

		public WebElement projectDescription()
		{
			return projectDescription;
		}

		//To close the project
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[1]")
		private WebElement closeProject;

		public WebElement closeProject()
		{
			return closeProject;
		}
		//to press on  create new tasks button
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")
		private WebElement addNewTaskButton;

		public WebElement addNewTaskButton()
		{
			return addNewTaskButton;
		}

		//to press on create new task button
		@FindBy(xpath="/html/body/div[13]/div[1]")
		private WebElement createNewTask;

		public WebElement createNewTaskButton()
		{
			return createNewTask;
		}

		//to create task1
		@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")
		private WebElement task1TextField;

		public WebElement task1TextField()
		{
			return task1TextField;
		}
		//to create task2
		@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[2]/td[1]/input")
		private WebElement task2TextField;

		public WebElement task2TextField()
		{
			return task2TextField;
		}

		//to create task3
		@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[3]/td[1]/input")
		private WebElement task3TextField;

		public WebElement task3TextField()
		{
			return task3TextField;
		}

		//to create task4
		@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[4]/td[1]/input")
		private WebElement task4TextField;

		public WebElement task4TextField()
		{
			return task4TextField;
		}

		//to create task5
		@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[5]/td[1]/input")
		private WebElement task5TextField;

		public WebElement task5TextField()
		{
			return task5TextField;
		}
		
		//create task confirmation button
		private WebElement createTasksPopup_commitBtn;
		
		public WebElement createTaskConfirmaionButton()
		{
			return createTasksPopup_commitBtn;
		}
		
		//to select all tasks
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/table/tbody/tr/td[1]/div/div")
		private WebElement selectAllTasksCheckBox;
		
		public WebElement selectAllTasksCheckBox()
		{
			return selectAllTasksCheckBox;
		}
		
		//to delete tasks
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[3]/div/div/div[4]")
		private WebElement deleteTasks;
		
		public WebElement deleteTasksButton()
		{
			return deleteTasks;
		}
		
		//delete task confirmation 
		private WebElement deleteTaskPopup_deleteConfirm_submitBtn;
		
		public WebElement deleteTasksConfirmation()
		{
			return deleteTaskPopup_deleteConfirm_submitBtn;
		}
	}




