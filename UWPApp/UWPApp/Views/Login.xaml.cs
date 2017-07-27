using System;
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
using UWPApp.Utils;
using UWPApp.Models;
using System.Diagnostics;

// The Blank Page item template is documented at https://go.microsoft.com/fwlink/?LinkId=234238

namespace UWPApp.Views
{
    /// <summary>
    /// An empty page that can be used on its own or navigated to within a Frame.
    /// </summary>
    public sealed partial class Login : Page
    {
        private User _user;
        public Login()
        {
            this.InitializeComponent();
        }
        
        protected override async void OnNavigatedTo(NavigationEventArgs e)
        {
            if(await MicrosoftPassportHelper.MicrosoftPassportAvailableCheckAsync())
            {

            }
            else
            {
                PassportStatus.Background = new SolidColorBrush(Windows.UI.Color.FromArgb(255, 50, 170, 207));
                PassportStatusText.Text = "Need to set up Microsoft Passport\n" + "Please go to Windows Settings and make a PIN to use.";
                PassportSignInButton.IsEnabled = false;
            }
        }

        private void PassportSignInButton_Click(object sender, RoutedEventArgs e)
        {
            SignIn();
            ErrorMessage.Text = "";
        }

        private void RegisterButtonTextBlock_OnPointerPressed(object sender, PointerRoutedEventArgs e)
        {
            ErrorMessage.Text = "";
            Frame.Navigate(typeof(Registration));
        }

        private async void SignIn()
        {
            if(UserHelper.ValidateUserCredentials(UsernameTextBox.Text))
            {
                //create new local account
                _user = UserHelper.AddUser(UsernameTextBox.Text);
                Debug.WriteLine("Successful sign in and create local user account");
                //login with passport
                if(await MicrosoftPassportHelper.CreatePassportKeyAsync(UsernameTextBox.Text))
                {
                    Debug.WriteLine("Signed in with Microsoft Passport");
                    Frame.Navigate(typeof(Welcome), _user);
                }
                else
                {
                    ErrorMessage.Text = "Unsuccessful Login";
                }

            }
        }
    }
}
