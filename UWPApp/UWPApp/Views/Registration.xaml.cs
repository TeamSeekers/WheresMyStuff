﻿using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Runtime.InteropServices.WindowsRuntime;
using Windows.Foundation;
using Windows.Foundation.Collections;
using Windows.UI.Xaml;
using Windows.UI.Xaml.Controls;
using Windows.UI.Xaml.Controls.Primitives;
using Windows.UI.Xaml.Data;
using Windows.UI.Xaml.Input;
using Windows.UI.Xaml.Media;
using Windows.UI.Xaml.Navigation;
using UWPApp.Models;
using UWPApp.Utils;

// The Blank Page item template is documented at https://go.microsoft.com/fwlink/?LinkId=234238

namespace UWPApp.Views
{

    /// <summary>
    /// An empty page that can be used on its own or navigated to within a Frame.
    /// </summary>
    public sealed partial class Registration : Page
    {
        private User _user;
        public static UserList users= new UserList();
        public Registration()
        {
            this.InitializeComponent();
        }

        private async void RegisterButton_Click_Async(object sender, RoutedEventArgs e)
        {
            ErrorMessage.Text = "";

            if(!string.IsNullOrEmpty(UsernameTextBox.Text))
            {
                _user = UserHelper.AddUser(UsernameTextBox.Text);
                users.addUser(_user);
                await MicrosoftPassportHelper.CreatePassportKeyAsync(_user.Username);
                Frame.Navigate(typeof(Welcome), _user);
            }
            else
            {
                ErrorMessage.Text = "Enter a User Name";
            }
        }
    }
}
