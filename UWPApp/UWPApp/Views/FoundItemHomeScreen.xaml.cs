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
using System.Diagnostics;

// The Blank Page item template is documented at https://go.microsoft.com/fwlink/?LinkId=234238

namespace UWPApp.Views
{
    /// <summary>
    /// An empty page that can be used on its own or navigated to within a Frame.
    /// </summary>
    public sealed partial class FoundItemHomeScreen : Page
    {
        public FoundItemHomeScreen()
        {
            this.InitializeComponent();
        }

        private void PostButton_Click(object sender, RoutedEventArgs e)
        {
            Debug.WriteLine("Going to Create New Item Screen");
            Frame.Navigate(typeof(NewFoundItem));
        }

        private void Search_button_Click(object sender, RoutedEventArgs e)
        {

        }

        private void Button_Logout_Click(object sender, RoutedEventArgs e)
        {
            Debug.WriteLine("Logging out");
            Frame.Navigate(typeof(Login));
        }

        private void Cancel_button_Click(object sender, RoutedEventArgs e)
        {
            Debug.WriteLine("Returning to Welcome Screen");
            Frame.Navigate(typeof(Welcome));
        }
    }
}
