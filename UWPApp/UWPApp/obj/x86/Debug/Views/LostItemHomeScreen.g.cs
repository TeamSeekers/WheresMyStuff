﻿#pragma checksum "C:\Users\Jordan Hughes\Desktop\GitHub\WheresMyStuff\UWPApp\UWPApp\Views\LostItemHomeScreen.xaml" "{406ea660-64cf-4c82-b6f0-42d48172a799}" "12DCCC67B0936E3651CAA4D34A15A3F9"
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace UWPApp.Views
{
    partial class LostItemHomeScreen : 
        global::Windows.UI.Xaml.Controls.Page, 
        global::Windows.UI.Xaml.Markup.IComponentConnector,
        global::Windows.UI.Xaml.Markup.IComponentConnector2
    {
        /// <summary>
        /// Connect()
        /// </summary>
        [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Windows.UI.Xaml.Build.Tasks"," 14.0.0.0")]
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute()]
        public void Connect(int connectionId, object target)
        {
            switch(connectionId)
            {
            case 1:
                {
                    this.Title = (global::Windows.UI.Xaml.Controls.TextBlock)(target);
                }
                break;
            case 2:
                {
                    this.PostButton = (global::Windows.UI.Xaml.Controls.Button)(target);
                    #line 13 "..\..\..\Views\LostItemHomeScreen.xaml"
                    ((global::Windows.UI.Xaml.Controls.Button)this.PostButton).Click += this.PostButton_Click;
                    #line default
                }
                break;
            case 3:
                {
                    this.SearchButton = (global::Windows.UI.Xaml.Controls.Button)(target);
                    #line 14 "..\..\..\Views\LostItemHomeScreen.xaml"
                    ((global::Windows.UI.Xaml.Controls.Button)this.SearchButton).Click += this.Search_button_Click;
                    #line default
                }
                break;
            case 4:
                {
                    this.CancelButton = (global::Windows.UI.Xaml.Controls.Button)(target);
                    #line 15 "..\..\..\Views\LostItemHomeScreen.xaml"
                    ((global::Windows.UI.Xaml.Controls.Button)this.CancelButton).Click += this.Cancel_button_Click;
                    #line default
                }
                break;
            case 5:
                {
                    this.LogoutButton = (global::Windows.UI.Xaml.Controls.Button)(target);
                    #line 16 "..\..\..\Views\LostItemHomeScreen.xaml"
                    ((global::Windows.UI.Xaml.Controls.Button)this.LogoutButton).Click += this.Button_Logout_Click;
                    #line default
                }
                break;
            default:
                break;
            }
            this._contentLoaded = true;
        }

        [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Windows.UI.Xaml.Build.Tasks"," 14.0.0.0")]
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute()]
        public global::Windows.UI.Xaml.Markup.IComponentConnector GetBindingConnector(int connectionId, object target)
        {
            global::Windows.UI.Xaml.Markup.IComponentConnector returnValue = null;
            return returnValue;
        }
    }
}
