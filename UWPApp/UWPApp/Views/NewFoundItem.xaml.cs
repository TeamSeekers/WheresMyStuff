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
    public sealed partial class NewFoundItem : Page
    {
        public NewFoundItem()
        {
            this.InitializeComponent();
        }

        private void Post_New_Found_Click(object sender, RoutedEventArgs e)
        {
            if (!string.IsNullOrEmpty(FoundItemNameTextBox.Text))
            {
                Debug.WriteLine("Posting item");
                //Need to add new foudn item here
                ErrorMessage.Text = "Item Added Succesfully";
                Frame.Navigate(typeof(FoundItemHomeScreen));
            }
            else
            {
                ErrorMessage.Text = "Please enter name of item";
            }
            

        }

        private void Cancel_Click(object sender, RoutedEventArgs e)
        {
            Debug.WriteLine("Canceling post new found item and return to found item home screen");
            Frame.Navigate(typeof(FoundItemHomeScreen));
        }
    }
}
