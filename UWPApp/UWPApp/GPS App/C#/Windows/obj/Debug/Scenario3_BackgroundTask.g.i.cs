﻿

#pragma checksum "C:\Users\Hari Tiwari\Desktop\Geolocation sample\C#\Shared\Scenario3_BackgroundTask.xaml" "{406ea660-64cf-4c82-b6f0-42d48172a799}" "FC412BAC56283A33259338EE1F33AD02"
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace Microsoft.Samples.Devices.Geolocation
{
    partial class Scenario3 : global::Windows.UI.Xaml.Controls.Page
    {
        [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Windows.UI.Xaml.Build.Tasks"," 4.0.0.0")]
        private global::Windows.UI.Xaml.Controls.Grid LayoutRoot; 
        [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Windows.UI.Xaml.Build.Tasks"," 4.0.0.0")]
        private global::Windows.UI.Xaml.Controls.TextBlock InputTextBlock; 
        [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Windows.UI.Xaml.Build.Tasks"," 4.0.0.0")]
        private global::Windows.UI.Xaml.Controls.TextBlock ScenarioOutput_Latitude; 
        [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Windows.UI.Xaml.Build.Tasks"," 4.0.0.0")]
        private global::Windows.UI.Xaml.Controls.TextBlock ScenarioOutput_Longitude; 
        [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Windows.UI.Xaml.Build.Tasks"," 4.0.0.0")]
        private global::Windows.UI.Xaml.Controls.TextBlock ScenarioOutput_Accuracy; 
        [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Windows.UI.Xaml.Build.Tasks"," 4.0.0.0")]
        private global::Windows.UI.Xaml.Controls.Button RegisterBackgroundTaskButton; 
        [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Windows.UI.Xaml.Build.Tasks"," 4.0.0.0")]
        private global::Windows.UI.Xaml.Controls.Button UnregisterBackgroundTaskButton; 
        [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Windows.UI.Xaml.Build.Tasks"," 4.0.0.0")]
        private bool _contentLoaded;

        [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Windows.UI.Xaml.Build.Tasks"," 4.0.0.0")]
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute()]
        public void InitializeComponent()
        {
            if (_contentLoaded)
                return;

            _contentLoaded = true;
            global::Windows.UI.Xaml.Application.LoadComponent(this, new global::System.Uri("ms-appx:///Scenario3_BackgroundTask.xaml"), global::Windows.UI.Xaml.Controls.Primitives.ComponentResourceLocation.Application);
 
            LayoutRoot = (global::Windows.UI.Xaml.Controls.Grid)this.FindName("LayoutRoot");
            InputTextBlock = (global::Windows.UI.Xaml.Controls.TextBlock)this.FindName("InputTextBlock");
            ScenarioOutput_Latitude = (global::Windows.UI.Xaml.Controls.TextBlock)this.FindName("ScenarioOutput_Latitude");
            ScenarioOutput_Longitude = (global::Windows.UI.Xaml.Controls.TextBlock)this.FindName("ScenarioOutput_Longitude");
            ScenarioOutput_Accuracy = (global::Windows.UI.Xaml.Controls.TextBlock)this.FindName("ScenarioOutput_Accuracy");
            RegisterBackgroundTaskButton = (global::Windows.UI.Xaml.Controls.Button)this.FindName("RegisterBackgroundTaskButton");
            UnregisterBackgroundTaskButton = (global::Windows.UI.Xaml.Controls.Button)this.FindName("UnregisterBackgroundTaskButton");
        }
    }
}



