﻿#pragma checksum "C:\Users\Jordan Hughes\Desktop\GitHub\WheresMyStuff\UWPApp\UWPApp\Views\NewFoundItem.xaml" "{406ea660-64cf-4c82-b6f0-42d48172a799}" "2E5001833F110AAAB0E5B4091A3B0B41"
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
    partial class NewFoundItem : 
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
                    this.FoundItemNameTextBox = (global::Windows.UI.Xaml.Controls.TextBox)(target);
                }
                break;
            case 2:
                {
                    this.Color = (global::Windows.UI.Xaml.Controls.TextBox)(target);
                }
                break;
            case 3:
                {
                    this.Description = (global::Windows.UI.Xaml.Controls.TextBox)(target);
                }
                break;
            case 4:
                {
                    this.Address = (global::Windows.UI.Xaml.Controls.TextBox)(target);
                }
                break;
            case 5:
                {
                    this.PostFoundItemButton = (global::Windows.UI.Xaml.Controls.Button)(target);
                    #line 21 "..\..\..\Views\NewFoundItem.xaml"
                    ((global::Windows.UI.Xaml.Controls.Button)this.PostFoundItemButton).Click += this.Post_New_Found_Click;
                    #line default
                }
                break;
            case 6:
                {
                    this.CancelButton = (global::Windows.UI.Xaml.Controls.Button)(target);
                    #line 22 "..\..\..\Views\NewFoundItem.xaml"
                    ((global::Windows.UI.Xaml.Controls.Button)this.CancelButton).Click += this.Cancel_Click;
                    #line default
                }
                break;
            case 7:
                {
                    this.ErrorMessage = (global::Windows.UI.Xaml.Controls.TextBlock)(target);
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

