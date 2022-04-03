package chapterFive.menu;

import java.util.Scanner;

public class NokiaMenu {
    public void nokiaMenu() {
        Scanner in = new Scanner(System.in);

        System.out.println("""
                MENU:
                1.  Phone book
                2.  Messages
                3.  Chat
                4.  Call register
                5.  Tones
                6.  Settings
                7.  Call divert
                8.  Games
                9.  Calculator
                10. Reminders
                11. Clock
                12. Profiles
                13. SIM services
                """);

        int menu = in.nextInt();
        switch (menu) {
            case (1) -> {
                var phoneBook = new PhoneBook();
                System.out.println("""
                        PHONE BOOK:
                        1.  Search
                        2.  Service Nos.
                        3.  Add name
                        4.  Erase
                        5.  Edit
                        6.  Assign tone
                        7.  Send b'card
                        8.  Options
                        9.  Speed dials
                        10. Voice tags
                        """);
                int phoneBookInput = in.nextInt();
                switch (phoneBookInput) {
                    case (1) -> phoneBook.search();
                    case (2) -> phoneBook.serviceNo();
                    case (3) -> phoneBook.addName();
                    case (4) -> phoneBook.erase();
                    case (5) -> phoneBook.edit();
                    case (6) -> phoneBook.assignTone();
                    case (7) -> phoneBook.sendbcard();
                    case (8) -> {
                        phoneBook.options();
                        int optionsInput = in.nextInt();
                        switch (optionsInput) {
                            case (1) -> phoneBook.typeOfView();
                            case (2) -> phoneBook.memoryStatus();
                        }
                    }
                    case (9) -> phoneBook.speedDials();
                    case (10) -> phoneBook.voiceTags();
                }
            }
            case (2) -> {
                var messages = new Messages();
                System.out.println("""
                        MESSAGES:
                        1.  Write messages
                        2.  Inbox
                        3.  Outbox
                        4.  Picture messages
                        5.  Templates
                        6.  Smileys
                        7.  Message settings
                        8.  Info service
                        9.  Voice mailbox number
                        10. Service command editor
                        """);
                int messagesInput = in.nextInt();
                switch (messagesInput) {
                    case (1) -> messages.writeMessages();
                    case (2) -> messages.inbox();
                    case (3) -> messages.outbox();
                    case (4) -> messages.pictureMessages();
                    case (5) -> messages.templates();
                    case (6) -> messages.smileys();
                    case (7) -> {
                        messages.messageSettings();
                        int messageSettingsInput = in.nextInt();
                        switch (messageSettingsInput) {
                            case (1) -> {
                                messages.set();
                                int setInput = in.nextInt();
                                switch (setInput) {
                                    case (1) -> messages.messageCenterNumber();
                                    case (2) -> messages.messageSentAs();
                                    case (3) -> messages.messageValidity();
                                }
                            }
                            case (2) -> {
                                messages.common();
                                int commonInput = in.nextInt();
                                switch (commonInput) {
                                    case (1) -> messages.deliveryReports();
                                    case (2) -> messages.replyViaSameCentre();
                                    case (3) -> messages.characterSupport();
                                }
                            }
                        }
                    }
                    case (8) -> messages.infoService();
                    case (9) -> messages.voiceMailboxNumber();
                    case (10) -> messages.serviceCommandEditor();
                }
            }
            case (3) -> {
                var chat = new Chat();
                chat.chat();
            }
            case (4) -> {
                var callRegister = new CallRegister();
                System.out.println("""
                        CALL REGISTER:
                        1. Missed calls
                        2. Received calls
                        3. Dialled calls
                        4. Erase recent call lists
                        5. Show call duration
                        6. Show call costs
                        7. Call cost settings
                        8. Prepaid credit
                        """);
                int callRegisterInput = in.nextInt();
                switch (callRegisterInput) {
                    case (1) -> callRegister.missedCalls();
                    case (2) -> callRegister.receivedCalls();
                    case (3) -> callRegister.dialledNumbers();
                    case (4) -> callRegister.eraseRecentCallLists();
                    case (5) -> {
                        callRegister.showCallDuration();
                        int showCallDurationInput = in.nextInt();
                        switch (showCallDurationInput) {
                            case (1) -> callRegister.lastCallDuration();
                            case (2) -> callRegister.allCallsDuration();
                            case (3) -> callRegister.receivedCallsDuration();
                            case (4) -> callRegister.dialledCallsDuration();
                            case (5) -> callRegister.clearTimers();
                        }
                    }
                    case (6) -> {
                        callRegister.showCallCosts();
                        int showCallCostsinput = in.nextInt();
                        switch (showCallCostsinput) {
                            case (1) -> callRegister.lastCallCost();
                            case (2) -> callRegister.allCallsCost();
                            case (3) -> callRegister.clearCounters();
                        }
                    }
                    case (7) -> {
                        callRegister.callCostSettings();
                        int callCostSettingsInput = in.nextInt();
                        switch (callCostSettingsInput) {
                            case (1) -> callRegister.callCostLimit();
                            case (2) -> callRegister.showCostsIn();
                        }
                    }
                    case (8) -> callRegister.prepaidCredit();
                }
            }
            case (5) -> {
                var tones = new Tones();
                System.out.println("""
                        TONES:
                        1. Ringing tone
                        2. Ringing volume
                        3. Incoming call alert
                        4. Composer
                        5. Message alert tone
                        6. Keypad tones
                        7. Warning and game tones
                        8. Vibrating alert
                        9. Screen saver
                        """);
                int tonesInput = in.nextInt();
                switch (tonesInput) {
                    case (1) -> tones.ringingTone();
                    case (2) -> tones.ringingVolume();
                    case (3) -> tones.incomingCallAlert();
                    case (4) -> tones.composer();
                    case (5) -> tones.messageAlertTone();
                    case (6) -> tones.keypadTones();
                    case (7) -> tones.warningAndGameTones();
                    case (8) -> tones.vibratingAlert();
                    case (9) -> tones.screenSaver();
                }
            }
            case (6) -> {
                var settings = new Settings();
                System.out.println("""
                        SETTINGS:
                        1. Call settings
                        2. Phone settings
                        3. Security settings
                        4. Restore factory settings
                        """);
                int settingsInput = in.nextInt();
                switch (settingsInput) {
                    case (1) -> {
                        settings.callSettings();
                        int callSettingsInput = in.nextInt();
                        switch (callSettingsInput) {
                            case (1) -> settings.automaticRedial();
                            case (2) -> settings.speedDialling();
                            case (3) -> settings.callWaitingOptions();
                            case (4) -> settings.ownNumberSending();
                            case (5) -> settings.phoneLineInUse();
                            case (6) -> settings.automaticAnswer();
                        }
                    }
                    case (2) -> {
                        settings.phoneSettings();
                        int phoneSettingsInput = in.nextInt();
                        switch (phoneSettingsInput) {
                            case (1) -> settings.language();
                            case (2) -> settings.cellInfoDisplay();
                            case (3) -> settings.welcomeNote();
                            case (4) -> settings.networkSelection();
                            case (5) -> settings.lights();
                            case (6) -> settings.confirmSimServiceActions();
                        }
                    }
                    case (3) -> {
                        settings.securitySettings();
                        int securitySettingsInput = in.nextInt();
                        switch (securitySettingsInput) {
                            case (1) -> settings.pinCodeRequest();
                            case (2) -> settings.callBarringService();
                            case (3) -> settings.fixedDialling();
                            case (4) -> settings.closedUserGroup();
                            case (5) -> settings.phoneSecurity();
                            case (6) -> settings.changeAccessCodes();
                        }
                    }
                    case (4) -> settings.restoreFactorySettings();
                }
            }
            case (7) -> {
                var callDivert =  new CallDivert();
                callDivert.callDivert();
            }
            case (8) -> {
                var games = new Games();
                games.games();
            }
            case (9) -> {
                var calculator = new Calculator();
                calculator.calculator();
            }
            case (10) -> {
                var reminders = new Reminder();
                reminders.reminders();
            }
            case (11) -> {
                var clock = new Clock();
                System.out.println("""
                        CLOCK:
                        1. Alarm clock
                        2. Clock settings
                        3. Date setting
                        4. Stopwatch
                        5. Countdown timer
                        6. Auto update of date and time
                        """);
                int clockInput = in.nextInt();
                switch (clockInput) {
                    case (1) -> clock.alarmClock();
                    case (2) -> clock.clockSettings();
                    case (3) -> clock.dateSetting();
                    case (4) -> clock.stopwatch();
                    case (5) -> clock.countdownTimer();
                    case (6) -> clock.autoUpdateOfDateAndTime();
                }
            }
            case (12) -> {
                var profiles = new Profiles();
                profiles.profiles();
            }
            case (13) -> {
                var simServices = new SimServices();
                simServices.simServices();
            }
        }
    }
}
