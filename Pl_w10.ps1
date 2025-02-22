[Windows.UI.Notifications.ToastNotificationManager, Windows.UI.Notifications, ContentType = WindowsRuntime] | Out-Null
$template = [Windows.UI.Notifications.ToastTemplateType]::ToastText01
$xml = [Windows.UI.Notifications.ToastNotificationManager]::GetTemplateContent($template)
$xmlString = $xml.GetXml()
$xmlString = $xmlString.Replace('<text id="1">', '<text id="1">Wave 10 incoming (Wargames: Denied)')
$xml.LoadXml($xmlString)
$toast = [Windows.UI.Notifications.ToastNotification]::new($xml)
[Windows.UI.Notifications.ToastNotificationManager]::CreateToastNotifier('Plankerton Endurance').Show($toast)
