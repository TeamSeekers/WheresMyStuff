﻿

#pragma checksum "C:\Users\Hari Tiwari\Desktop\Geolocation sample\C#\Shared\Scenario5_GeofenceBackgroundTask.xaml" "{406ea660-64cf-4c82-b6f0-42d48172a799}" "11E7178466934A0F8753B6ABD763CDCA"
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
    partial class Scenario5 : global::Windows.UI.Xaml.Controls.Page, global::Windows.UI.Xaml.Markup.IComponentConnector
    {
        [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Windows.UI.Xaml.Build.Tasks"," 4.0.0.0")]
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute()]
 
        public void Connect(int connectionId, object target)
        {
            switch(connectionId)
            {
            case 1:
                #line 18 "..\..\Scenario5_GeofenceBackgroundTask.xaml"
                ((global::Windows.UI.Xaml.Controls.Primitives.ButtonBase)(target)).Click += this.RegisterBackgroundTask;
                 #line default
                 #line hidden
                break;
            case 2:
                #line 19 "..\..\Scenario5_GeofenceBackgroundTask.xaml"
                ((global::Windows.UI.Xaml.Controls.Primitives.ButtonBase)(target)).Click += this.UnregisterBackgroundTask;
                 #line default
                 #line hidden
                break;
            }
            this._contentLoaded = true;
        }
    }
}


