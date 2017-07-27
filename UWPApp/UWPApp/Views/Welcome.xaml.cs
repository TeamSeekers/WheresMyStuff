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
using UWPApp.Models;
using UWPApp.Utils;
using System.Diagnostics;

// The Blank Page item template is documented at https://go.microsoft.com/fwlink/?LinkId=234238

namespace UWPApp.Views
{
    /// <summary>
    /// An empty page that can be used on its own or navigated to within a Frame.
    /// </summary>
    public sealed partial class Welcome : Page
    {
        private User _activeUser;
        public Welcome()
        {
            this.InitializeComponent();
        }
        protected override void OnNavigatedTo(NavigationEventArgs e)
        {
            _activeUser = (User)e.Parameter;
            if (_activeUser != null)
            {
                UserNameText.Text = _activeUser.Username;
            }
        }
        private void Button_Forget_User_Click(object sender, RoutedEventArgs e)
        {
            MicrosoftPassportHelper.RemovePassportAccountAsync(_activeUser);
            UserHelper.RemoveUser(_activeUser);

            Debug.WriteLine("User " + _activeUser.Username + " deleted");
        }
        private void Button_Lost_Item_Click(object sender, RoutedEventArgs e)
        {
            Debug.WriteLine("Going to lost items screen");
            Frame.Navigate(typeof(LostItemHomeScreen));
        }

        private void Button_Logout_Click(object sender, RoutedEventArgs e)
        {
            Debug.WriteLine("Logging out");
            Frame.Navigate(typeof(Login));
        }

        private void Button_Found_Item_Click(object sender, RoutedEventArgs e)
        {
            Debug.WriteLine("Going to found Items screen");
            Frame.Navigate(typeof(FoundItemHomeScreen));
        }
    }
}
