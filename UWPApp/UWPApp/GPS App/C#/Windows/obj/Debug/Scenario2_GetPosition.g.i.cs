﻿

#pragma checksum "C:\Users\Hari Tiwari\Desktop\Geolocation sample\C#\Shared\Scenario2_GetPosition.xaml" "{406ea660-64cf-4c82-b6f0-42d48172a799}" "DFB728BD714B9404D8E77A3A4DFB763A"
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
    partial class Scenario2 : global::Windows.UI.Xaml.Controls.Page
    {
        [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Windows.UI.Xaml.Build.Tasks"," 4.0.0.0")]
        private global::Windows.UI.Xaml.Controls.Grid LayoutRoot; 
        [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Windows.UI.Xaml.Build.Tasks"," 4.0.0.0")]
        private global::Windows.UI.Xaml.Controls.TextBlock InputTextBlock; 
        [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Windows.UI.Xaml.Build.Tasks"," 4.0.0.0")]
        private global::Windows.UI.Xaml.Controls.TextBlock Label_PosPrecision; 
        [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Windows.UI.Xaml.Build.Tasks"," 4.0.0.0")]
        private global::Windows.UI.Xaml.Controls.TextBlock Label_HorzPrecision; 
        [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Windows.UI.Xaml.Build.Tasks"," 4.0.0.0")]
        private global::Windows.UI.Xaml.Controls.TextBlock Label_VertPrecision; 
        [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Windows.UI.Xaml.Build.Tasks"," 4.0.0.0")]
        private global::Windows.UI.Xaml.Controls.TextBlock ScenarioOutput_Latitude; 
        [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Windows.UI.Xaml.Build.Tasks"," 4.0.0.0")]
        private global::Windows.UI.Xaml.Controls.TextBlock ScenarioOutput_Longitude; 
        [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Windows.UI.Xaml.Build.Tasks"," 4.0.0.0")]
        private global::Windows.UI.Xaml.Controls.TextBlock ScenarioOutput_Accuracy; 
        [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Windows.UI.Xaml.Build.Tasks"," 4.0.0.0")]
        private global::Windows.UI.Xaml.Controls.TextBlock ScenarioOutput_Source; 
        [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Windows.UI.Xaml.Build.Tasks"," 4.0.0.0")]
        private global::Windows.UI.Xaml.Controls.TextBlock ScenarioOutput_PosPrecision; 
        [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Windows.UI.Xaml.Build.Tasks"," 4.0.0.0")]
        private global::Windows.UI.Xaml.Controls.TextBlock ScenarioOutput_HorzPrecision; 
        [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Windows.UI.Xaml.Build.Tasks"," 4.0.0.0")]
        private global::Windows.UI.Xaml.Controls.TextBlock ScenarioOutput_VertPrecision; 
        [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Windows.UI.Xaml.Build.Tasks"," 4.0.0.0")]
        private global::Windows.UI.Xaml.Controls.TextBlock ScenarioOutput_DesiredAccuracyInMeters; 
        [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Windows.UI.Xaml.Build.Tasks"," 4.0.0.0")]
        private global::Windows.UI.Xaml.Controls.TextBox DesiredAccuracyInMeters; 
        [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Windows.UI.Xaml.Build.Tasks"," 4.0.0.0")]
        private global::Windows.UI.Xaml.Controls.Button SetDesiredAccuracyInMeters; 
        [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Windows.UI.Xaml.Build.Tasks"," 4.0.0.0")]
        private global::Windows.UI.Xaml.Controls.Button GetGeolocationButton; 
        [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Windows.UI.Xaml.Build.Tasks"," 4.0.0.0")]
        private global::Windows.UI.Xaml.Controls.Button CancelGetGeolocationButton; 
        [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Windows.UI.Xaml.Build.Tasks"," 4.0.0.0")]
        private bool _contentLoaded;

        [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Windows.UI.Xaml.Build.Tasks"," 4.0.0.0")]
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute()]
        public void InitializeComponent()
        {
            if (_contentLoaded)
                return;

            _contentLoaded = true;
            global::Windows.UI.Xaml.Application.LoadComponent(this, new global::System.Uri("ms-appx:///Scenario2_GetPosition.xaml"), global::Windows.UI.Xaml.Controls.Primitives.ComponentResourceLocation.Application);
 
            LayoutRoot = (global::Windows.UI.Xaml.Controls.Grid)this.FindName("LayoutRoot");
            InputTextBlock = (global::Windows.UI.Xaml.Controls.TextBlock)this.FindName("InputTextBlock");
            Label_PosPrecision = (global::Windows.UI.Xaml.Controls.TextBlock)this.FindName("Label_PosPrecision");
            Label_HorzPrecision = (global::Windows.UI.Xaml.Controls.TextBlock)this.FindName("Label_HorzPrecision");
            Label_VertPrecision = (global::Windows.UI.Xaml.Controls.TextBlock)this.FindName("Label_VertPrecision");
            ScenarioOutput_Latitude = (global::Windows.UI.Xaml.Controls.TextBlock)this.FindName("ScenarioOutput_Latitude");
            ScenarioOutput_Longitude = (global::Windows.UI.Xaml.Controls.TextBlock)this.FindName("ScenarioOutput_Longitude");
            ScenarioOutput_Accuracy = (global::Windows.UI.Xaml.Controls.TextBlock)this.FindName("ScenarioOutput_Accuracy");
            ScenarioOutput_Source = (global::Windows.UI.Xaml.Controls.TextBlock)this.FindName("ScenarioOutput_Source");
            ScenarioOutput_PosPrecision = (global::Windows.UI.Xaml.Controls.TextBlock)this.FindName("ScenarioOutput_PosPrecision");
            ScenarioOutput_HorzPrecision = (global::Windows.UI.Xaml.Controls.TextBlock)this.FindName("ScenarioOutput_HorzPrecision");
            ScenarioOutput_VertPrecision = (global::Windows.UI.Xaml.Controls.TextBlock)this.FindName("ScenarioOutput_VertPrecision");
            ScenarioOutput_DesiredAccuracyInMeters = (global::Windows.UI.Xaml.Controls.TextBlock)this.FindName("ScenarioOutput_DesiredAccuracyInMeters");
            DesiredAccuracyInMeters = (global::Windows.UI.Xaml.Controls.TextBox)this.FindName("DesiredAccuracyInMeters");
            SetDesiredAccuracyInMeters = (global::Windows.UI.Xaml.Controls.Button)this.FindName("SetDesiredAccuracyInMeters");
            GetGeolocationButton = (global::Windows.UI.Xaml.Controls.Button)this.FindName("GetGeolocationButton");
            CancelGetGeolocationButton = (global::Windows.UI.Xaml.Controls.Button)this.FindName("CancelGetGeolocationButton");
        }
    }
}



