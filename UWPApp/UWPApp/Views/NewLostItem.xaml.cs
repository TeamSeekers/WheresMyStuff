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
using UWPApp.Models;
using UWPApp.Utils;

// The Blank Page item template is documented at https://go.microsoft.com/fwlink/?LinkId=234238

namespace UWPApp.Views
{
    /// <summary>
    /// An empty page that can be used on its own or navigated to within a Frame.
    /// </summary>
    public sealed partial class NewLostItem : Page
    {
        public static LostItemList lostitems = new LostItemList();
       
        public NewLostItem()
        {
            this.InitializeComponent();
        }

        private void Cancel_Click(object sender, RoutedEventArgs e)
        {
            Debug.WriteLine("Canceling new lost item post");
            Frame.Navigate(typeof(LostItemHomeScreen));
        }

        private void Post_New_Lost_Click(object sender, RoutedEventArgs e)
        {
            if(!string.IsNullOrEmpty(LostItemNameTextBox.Text))
            {
                Debug.WriteLine("Adding New Lost Item");
                //Add lost item to list
                LostItem lost = new LostItem(LostItemNameTextBox.Text, Color.Text, Description.Text, Address.Text);
                lostitems.AddItem(lost);
                ErrorMessage.Text = "Added New Lost Item";
                Frame.Navigate(typeof(LostItemHomeScreen));
            }
            else
            {
                ErrorMessage.Text = "Enter Name of item";
            }
        }
    }
}
