using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Diagnostics;
using Windows.Security.Credentials;
using UWPApp.Models;

namespace UWPApp.Utils
{
    public static class MicrosoftPassportHelper
    {
        //Let's see if Passport can be used. Need to have connected MIcrosoft Account, and a Windows pin for that account
        public static async Task<bool> MicrosoftPassportAvailableCheckAsync()
        {
            bool CredAvailable = await KeyCredentialManager.IsSupportedAsync();
            if(CredAvailable == false)
            {
                Debug.WriteLine("Microsoft Passport isn't set up.\n Go to Windows settings and make a PIN to use.");
                return false;
            }
            return true;
        }
        public static async Task<bool> CreatePassportKeyAsync(string accountId)
        {
            KeyCredentialRetrievalResult keyCreationResult = await KeyCredentialManager.RequestCreateAsync(accountId, KeyCredentialCreationOption.ReplaceExisting);
            switch (keyCreationResult.Status)
            {
                case KeyCredentialStatus.Success:
                    Debug.WriteLine("Key made");
                    //Would need more authentification for this to work in a real world scenario
                    return true;
                case KeyCredentialStatus.UserCanceled:
                    Debug.WriteLine("User cancelled sign in");
                    break;
                case KeyCredentialStatus.NotFound:
                    //Not found means we need to set up Passport
                    Debug.WriteLine("Windows Passport is not set up");
                    break;
                default:
                    break;
            }
            return false;
        }
        public static async void RemovePassportAccountAsync(User user)
        {
            KeyCredentialRetrievalResult keyOpenResult = await KeyCredentialManager.OpenAsync(user.Username);
            if(keyOpenResult.Status==KeyCredentialStatus.Success)
            {
                //would need to notify a data bawse here to remove the account from a server
            }
            await KeyCredentialManager.DeleteAsync(user.Username);
        }
           
    }
}
