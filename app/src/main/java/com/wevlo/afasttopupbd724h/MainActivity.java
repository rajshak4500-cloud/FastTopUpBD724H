<!DOCTYPE html>
<html lang="bn" class="dark">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ডায়মন্ড জোন বিডি - ডায়মন্ড টপ-আপ ও উইকলি মেম্বারশিপ</title>
    <!-- Tailwind CSS CDN -->
    <script src="https://cdn.tailwindcss.com"></script>
    <!-- Font Awesome Icons -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
    <!-- Google Fonts: Hind Siliguri for clean Bengali & Orbitron for gaming numbers -->
    <link href="https://fonts.googleapis.com/css2?family=Hind+Siliguri:wght@400;500;600;700&family=Orbitron:wght@600;800&display=swap" rel="stylesheet">
    
    <script>
        tailwind.config = {
            darkMode: 'class',
            theme: {
                extend: {
                    fontFamily: {
                        sans: ['"Hind Siliguri"', 'sans-serif'],
                        gaming: ['"Orbitron"', 'sans-serif'],
                    },
                    colors: {
                        darkBg: '#090d16',
                        cardBg: '#111827',
                        bkash: '#e2136e',
                        nagad: '#f7941d',
                    }
                }
            }
        }
    </script>
    <style>
        body {
            background-color: #090d16;
            color: #f3f4f6;
            background-image: 
                radial-gradient(circle at 15% 50%, rgba(6, 182, 212, 0.08), transparent 25%),
                radial-gradient(circle at 85% 30%, rgba(168, 85, 247, 0.08), transparent 25%);
        }
        .glass-card {
            background: rgba(17, 24, 39, 0.8);
            backdrop-filter: blur(12px);
            border: 1px solid rgba(255, 255, 255, 0.08);
        }
        .weekly-glow {
            box-shadow: 0 0 25px rgba(245, 158, 11, 0.25);
            border: 1.5px solid rgba(245, 158, 11, 0.6);
        }
        .weekly-glow:hover {
            box-shadow: 0 0 35px rgba(245, 158, 11, 0.45);
        }
        @keyframes float {
            0%, 100% { transform: translateY(0px); }
            50% { transform: translateY(-6px); }
        }
        .animate-float {
            animation: float 3s ease-in-out infinite;
        }
        @keyframes pulseGlow {
            0%, 100% { box-shadow: 0 0 0 0 rgba(245, 158, 11, 0.35); }
            50% { box-shadow: 0 0 20px 2px rgba(245, 158, 11, 0.18); }
        }
        .pending-pulse {
            animation: pulseGlow 2.4s infinite;
        }
        ::-webkit-scrollbar { width: 6px; }
        ::-webkit-scrollbar-track { background: #090d16; }
        ::-webkit-scrollbar-thumb { background: #1e293b; border-radius: 10px; }
    </style>
</head>
<body class="min-h-screen flex flex-col antialiased selection:bg-cyan-500 selection:text-white">

    <!-- Toast Notification Container -->
    <div id="toast-container" class="fixed top-5 right-5 z-50 flex flex-col gap-3 max-w-sm w-full pointer-events-none px-4 sm:px-0"></div>

    <!-- Navbar -->
    <header class="sticky top-0 z-40 glass-card border-b border-slate-800/80">
        <div class="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8 h-16 flex items-center justify-between">
            <div class="flex items-center gap-3 cursor-pointer" onclick="window.scrollTo({top: 0, behavior: 'smooth'})">
                <div class="w-10 h-10 rounded-xl bg-gradient-to-tr from-cyan-500 to-purple-600 flex items-center justify-center shadow-lg shadow-cyan-500/20">
                    <i class="fa-solid fa-gem text-white text-lg"></i>
                </div>
                <div>
                    <h1 class="text-xl font-bold bg-gradient-to-r from-cyan-400 to-purple-400 bg-clip-text text-transparent">
                        ডায়মন্ড জোন বিডি
                    </h1>
                    <p class="text-[11px] text-slate-400 -mt-1">দ্রুত ও বিশ্বস্ত টপ-আপ</p>
                </div>
            </div>

            <div id="nav-auth-area" class="flex items-center gap-2 sm:gap-3"></div>
        </div>
    </header>

    <!-- Main Content -->
    <main class="flex-grow max-w-7xl mx-auto w-full px-4 sm:px-6 lg:px-8 py-6 sm:py-10 space-y-10">

        <!-- Hero / Featured 95 Taka Weekly Membership Banner -->
        <section class="relative overflow-hidden rounded-2xl bg-gradient-to-r from-slate-900 via-indigo-950 to-slate-900 weekly-glow p-6 sm:p-10">
            <div class="absolute -right-10 -top-10 w-64 h-64 bg-amber-500/10 rounded-full blur-3xl pointer-events-none"></div>
            <div class="absolute -left-10 -bottom-10 w-64 h-64 bg-purple-500/10 rounded-full blur-3xl pointer-events-none"></div>

            <div class="relative z-10 grid grid-cols-1 lg:grid-cols-12 gap-8 items-center">
                <div class="lg:col-span-7 space-y-4">
                    <div class="inline-flex items-center gap-2 px-3 py-1 rounded-full bg-amber-500/20 border border-amber-500/40 text-amber-300 text-xs sm:text-sm font-semibold">
                        <i class="fa-solid fa-crown text-amber-400"></i>
                        <span>শুধুমাত্র রেজিস্টার্ড মেম্বারদের জন্য স্পেশাল অফার</span>
                    </div>
                    
                    <h2 class="text-3xl sm:text-4xl lg:text-5xl font-bold text-white leading-tight">
                        মাত্র <span class="text-amber-400 font-gaming">৯৫</span> টাকায় <br class="hidden sm:block">
                        <span class="bg-gradient-to-r from-amber-300 via-yellow-400 to-orange-400 bg-clip-text text-transparent">উইকলি মেম্বারশিপ!</span>
                    </h2>
                    
                    <p class="text-slate-300 text-sm sm:text-base max-w-xl leading-relaxed">
                        প্রতিদিন লগইন করে বুঝে নিন মোট <strong class="text-cyan-400">৪৫০ ডায়মন্ড</strong>! অ্যাকাউন্ট রেজিস্ট্রেশন বা লগইন করে বিকাশ বা নগদ পার্সোনাল নম্বরে পেমেন্ট করে মেম্বারশিপ অ্যাক্টিভ করুন।
                    </p>

                    <div class="flex flex-wrap gap-3 pt-2 text-xs sm:text-sm text-slate-300">
                        <span class="flex items-center gap-1.5 bg-slate-800/80 px-3 py-1.5 rounded-lg border border-slate-700">
                            <i class="fa-solid fa-bolt text-yellow-400"></i> ৫ মিনিটে ডেলিভারি
                        </span>
                        <span class="flex items-center gap-1.5 bg-slate-800/80 px-3 py-1.5 rounded-lg border border-slate-700">
                            <i class="fa-solid fa-shield-halved text-pink-400"></i> বিকাশ ও নগদ পার্সোনাল: 01863582630
                        </span>
                    </div>
                </div>

                <div class="lg:col-span-5">
                    <div class="bg-slate-900/90 border border-amber-500/40 rounded-2xl p-6 shadow-2xl relative">
                        <div class="absolute -top-3 right-4 bg-gradient-to-r from-amber-500 to-orange-600 text-slate-950 font-bold text-xs px-3 py-1 rounded-full shadow-md">
                            সবচেয়ে জনপ্রিয়
                        </div>

                        <div class="flex items-center gap-4 mb-5">
                            <div class="w-16 h-16 rounded-2xl bg-gradient-to-br from-amber-400/20 to-orange-500/20 border border-amber-400/40 flex items-center justify-center animate-float">
                                <svg class="w-10 h-10 text-amber-400" viewBox="0 0 24 24" fill="currentColor">
                                    <path d="M5 16L3 5l5.5 5L12 4l3.5 6L21 5l-2 11H5zm14 3c0 .6-.4 1-1 1H6c-.6 0-1-.4-1-1v-1h14v1z"/>
                                </svg>
                            </div>
                            <div>
                                <h3 class="text-xl font-bold text-white">উইকলি মেম্বারশিপ</h3>
                                <p class="text-cyan-400 text-sm font-medium flex items-center gap-1">
                                    <i class="fa-solid fa-gem text-xs"></i> মোট ৪৫০ ডায়মন্ড (৭ দিন)
                                </p>
                            </div>
                        </div>

                        <div class="flex items-baseline justify-between border-y border-slate-800 py-3 mb-5">
                            <span class="text-slate-400 text-sm">অফার মূল্য:</span>
                            <div class="text-right">
                                <span class="text-slate-500 line-through text-sm mr-2">৳ ১৬০</span>
                                <span class="text-3xl font-bold text-amber-400">৳ ৯৫</span>
                            </div>
                        </div>

                        <button onclick="initiatePurchase('উইকলি মেম্বারশিপ (৪৫০ ডায়মন্ড)', 95, true)" 
                            class="w-full py-3.5 px-6 rounded-xl bg-gradient-to-r from-amber-500 to-orange-600 hover:from-amber-400 hover:to-orange-500 text-slate-950 font-bold text-base sm:text-lg shadow-lg shadow-amber-500/25 transition-all transform active:scale-95 flex items-center justify-center gap-2">
                            <i class="fa-solid fa-cart-shopping"></i>
                            <span>এখনই কিনুন (৯৫ টাকা)</span>
                        </button>
                        <p id="membership-lock-note" class="text-center text-xs text-amber-300/80 mt-2.5">
                            <i class="fa-solid fa-lock mr-1"></i> মেম্বারশিপ নিতে লগইন বা সাইন-আপ আবশ্যক
                        </p>
                    </div>
                </div>
            </div>
        </section>

        <!-- Step 1: Player UID Input Section -->
        <section class="glass-card rounded-2xl p-6 border border-cyan-500/20">
            <div class="flex flex-col md:flex-row md:items-center justify-between gap-4">
                <div class="flex items-center gap-3">
                    <span class="w-8 h-8 rounded-lg bg-cyan-500/20 text-cyan-400 font-bold flex items-center justify-center border border-cyan-500/30">১</span>
                    <div>
                        <h3 class="text-lg font-bold text-white">প্লেয়ার আইডি (Player UID) দিন</h3>
                        <p class="text-xs text-slate-400">সঠিক ইউআইডি দিন, ভুল ইউআইডির জন্য কর্তৃপক্ষ দায়ী নয়</p>
                    </div>
                </div>

                <div class="flex-grow max-w-md w-full">
                    <div class="relative">
                        <div class="absolute inset-y-0 left-0 pl-3.5 flex items-center pointer-events-none text-slate-400">
                            <i class="fa-solid fa-gamepad"></i>
                        </div>
                        <input type="number" id="player-uid-input" placeholder="আপনার গেমের UID লিখুন (যেমন: 123456789)" 
                            class="w-full pl-10 pr-4 py-3 bg-slate-900/90 border border-slate-700 focus:border-cyan-500 rounded-xl text-white placeholder-slate-500 outline-none transition">
                    </div>
                </div>
            </div>
        </section>

        <!-- Step 2: Regular Diamond Top-Up Packages -->
        <section class="space-y-4">
            <div class="flex items-center justify-between">
                <div class="flex items-center gap-3">
                    <span class="w-8 h-8 rounded-lg bg-purple-500/20 text-purple-400 font-bold flex items-center justify-center border border-purple-500/30">২</span>
                    <h3 class="text-xl font-bold text-white">রেগুলার ডায়মন্ড টপ-আপ</h3>
                </div>
                <span class="text-xs text-slate-400 bg-slate-800/80 px-3 py-1 rounded-full">BD Server Only</span>
            </div>

            <div class="grid grid-cols-2 sm:grid-cols-3 lg:grid-cols-4 gap-4" id="packages-grid"></div>
        </section>

        <!-- Step 3: Combined bKash & Nagad Payment Card (Click to Select) -->
        <section class="space-y-4">
            <div class="flex flex-col sm:flex-row sm:items-center justify-between gap-2">
                <div class="flex items-center gap-3">
                    <span class="w-8 h-8 rounded-lg bg-pink-500/20 text-pink-400 font-bold flex items-center justify-center border border-pink-500/30">৩</span>
                    <div>
                        <h3 class="text-xl font-bold text-white">পেমেন্ট কার্ড (বিকাশ ও নগদ)</h3>
                        <p class="text-xs text-pink-300 font-medium">বিকাশ পার্সোনাল শুধু সেন্ড মানি গ্রহণ করা হয়।</p>
                    </div>
                </div>
                <span class="text-xs text-amber-300 bg-amber-500/10 border border-amber-500/25 px-3 py-1 rounded-full">
                    ২ মিনিট পর পেন্ডিং হিস্ট্রি স্থায়ীভাবে মুছে যাবে
                </span>
            </div>

            <div id="combined-payment-card" class="glass-card rounded-2xl p-6 max-w-2xl mx-auto border-2 border-[#e2136e]/50 space-y-5">
                <div class="flex flex-col sm:flex-row sm:items-center justify-between gap-3 border-b border-slate-800 pb-4">
                    <div>
                        <span class="text-xs text-slate-400 block">মেথড সিলেক্ট করুন (ক্লিক করে)</span>
                        <h4 class="text-lg font-bold text-white">
                            বর্তমান মাধ্যম: <span id="card-active-method-title" class="text-pink-400">বিকাশ পার্সোনাল</span>
                        </h4>
                        <p id="card-send-money-note" class="text-xs text-pink-300 mt-0.5 font-medium">
                            বিকাশ পার্সোনাল শুধু সেন্ড মানি গ্রহণ করা হয়।
                        </p>
                    </div>

                    <!-- Clickable Method Selector Buttons Together -->
                    <div class="grid grid-cols-2 gap-2.5">
                        <button type="button" id="card-select-bkash" onclick="selectCombinedMethod('bkash')"
                            class="px-4 py-2.5 rounded-xl bg-[#e2136e] text-white font-bold text-xs sm:text-sm border-2 border-white flex items-center justify-center gap-2 transition cursor-pointer">
                            <i class="fa-solid fa-wallet"></i>
                            <span>বিকাশ</span>
                        </button>
                        <button type="button" id="card-select-nagad" onclick="selectCombinedMethod('nagad')"
                            class="px-4 py-2.5 rounded-xl bg-[#f7941d] text-slate-950 font-bold text-xs sm:text-sm border-2 border-transparent flex items-center justify-center gap-2 transition cursor-pointer">
                            <i class="fa-solid fa-money-bill-transfer"></i>
                            <span>নগদ</span>
                        </button>
                    </div>
                </div>

                <!-- Selected Wallet Number Box -->
                <div id="card-wallet-box" class="bg-slate-950/90 border border-[#e2136e]/40 rounded-xl p-4 flex items-center justify-between gap-3">
                    <div>
                        <span id="card-wallet-label" class="text-xs text-pink-300 block font-semibold">বিকাশ পার্সোনাল নম্বর</span>
                        <strong class="font-mono text-xl font-bold text-white tracking-wider">01863582630</strong>
                    </div>
                    <button type="button" onclick="copyWalletNumber(activeCheckout.method)"
                        class="px-3.5 py-2 rounded-xl bg-white/10 hover:bg-white/20 text-white text-xs font-bold flex items-center gap-1.5 transition cursor-pointer">
                        <i class="fa-regular fa-copy"></i> কপি করুন
                    </button>
                </div>

                <!-- Transaction ID Input & Confirm -->
                <div class="space-y-3">
                    <input type="text" id="combined-trx-input" placeholder="Transaction ID লিখুন (যেমন: 9H7G6F5D4S)"
                        class="w-full px-4 py-3 bg-slate-950 border border-slate-700 focus:border-cyan-500 rounded-xl text-white text-sm outline-none font-mono uppercase">
                    <button type="button" id="combined-confirm-btn" onclick="confirmCombinedPayment()"
                        class="w-full py-3.5 px-5 rounded-xl bg-[#e2136e] hover:opacity-95 text-white font-bold text-sm sm:text-base transition flex items-center justify-center gap-2 cursor-pointer">
                        <i class="fa-solid fa-circle-check"></i>
                        <span>ট্রানজেকশন কনফার্ম করুন</span>
                    </button>
                    <p id="combined-card-status" class="text-sm font-bold text-amber-300 hidden pt-1"></p>
                </div>
            </div>
        </section>

        <!-- Payment Status Section (Permanently disappears after 2 minutes; never returns) -->
        <section id="payment-status-page" class="glass-card rounded-3xl p-6 sm:p-7 space-y-5 border border-amber-500/35 pending-pulse">
            <div class="flex flex-col sm:flex-row sm:items-center justify-between gap-4 border-b border-slate-800/90 pb-4">
                <div class="flex items-start sm:items-center gap-3.5">
                    <div id="status-icon-box" class="w-12 h-12 rounded-2xl bg-amber-500/15 border border-amber-500/35 flex items-center justify-center text-amber-400 text-xl shrink-0">
                        <i class="fa-solid fa-hourglass-half fa-spin" style="--fa-animation-duration: 3s;"></i>
                    </div>
                    <div>
                        <h3 class="text-lg sm:text-xl font-bold text-white">
                            অর্ডার ও পেমেন্ট স্ট্যাটাস
                        </h3>
                        <p id="status-page-subtitle" class="text-xs sm:text-sm text-slate-400 mt-0.5">
                            বিকাশ ও নগদ পার্সোনাল নম্বর: <strong class="text-cyan-400 font-mono">01863582630</strong> • বিকাশ পার্সোনাল শুধু সেন্ড মানি গ্রহণ করা হয়।
                        </p>
                    </div>
                </div>
                <div class="flex items-center gap-2 self-start sm:self-center">
                    <span id="status-auto-timer" class="text-xs font-mono px-2.5 py-1 rounded-full bg-slate-800 text-cyan-300 border border-slate-700">
                        ০২:০০ বাকি
                    </span>
                    <span id="status-page-badge" class="inline-flex items-center gap-2 px-3.5 py-1.5 rounded-full text-xs sm:text-sm font-bold bg-amber-500/20 text-amber-300 border border-amber-500/40">
                        <i class="fa-solid fa-clock"></i> পেন্ডিং
                    </span>
                </div>
            </div>

            <div id="status-page-card" class="bg-gradient-to-br from-slate-950/95 via-slate-900/95 to-amber-950/20 border border-amber-500/25 rounded-2xl p-5 space-y-5">
                <div class="flex flex-col md:flex-row md:items-center justify-between gap-3">
                    <div class="space-y-1">
                        <span id="status-page-success-title" class="text-lg sm:text-xl font-bold text-amber-300 block">
                            পেন্ডিং — আপনার পেমেন্ট যাচাইয়ের অপেক্ষায় আছে
                        </span>
                        <p id="status-page-desc" class="text-xs sm:text-sm text-slate-300 leading-relaxed">
                            বিকাশ পার্সোনাল শুধু সেন্ড মানি গ্রহণ করা হয়। <strong class="text-cyan-400 font-mono">01863582630</strong> নম্বরে টাকা পাঠানোর পর অর্ডারটি বর্তমানে <strong class="text-amber-300">পেন্ডিং</strong> অবস্থায় আছে। ২ মিনিট শেষ হলে এই পেন্ডিং হিস্ট্রি স্থায়ীভাবে মুছে যাবে এবং দ্বিতীয়বার আর দেখাবে না।
                        </p>
                    </div>
                    <span id="status-page-state-pill" class="self-start md:self-center text-xs font-bold px-3.5 py-1.5 rounded-xl bg-amber-500/20 text-amber-300 border border-amber-500/40 shrink-0">
                        অর্ডার পেন্ডিং
                    </span>
                </div>

                <!-- Step Progress Tracker -->
                <div class="grid grid-cols-3 gap-2 sm:gap-3 pt-1">
                    <div id="step-1-box" class="rounded-xl p-3 bg-emerald-500/10 border border-emerald-500/30">
                        <div class="flex items-center gap-1.5 text-xs font-bold text-emerald-300">
                            <i class="fa-solid fa-circle-check"></i>
                            <span>ধাপ ১</span>
                        </div>
                        <p id="step-1-text" class="text-[11px] sm:text-xs text-slate-300 mt-1">ট্রানজেকশন জমা হয়েছে</p>
                    </div>

                    <div id="step-2-box" class="rounded-xl p-3 bg-amber-500/15 border border-amber-500/40">
                        <div class="flex items-center gap-1.5 text-xs font-bold text-amber-300">
                            <i class="fa-solid fa-clock"></i>
                            <span>ধাপ ২</span>
                        </div>
                        <p id="step-2-text" class="text-[11px] sm:text-xs text-amber-200 mt-1 font-medium">পেমেন্ট পেন্ডিং (যাচাই চলছে)</p>
                    </div>

                    <div id="step-3-box" class="rounded-xl p-3 bg-slate-900/80 border border-slate-800">
                        <div class="flex items-center gap-1.5 text-xs font-bold text-slate-400">
                            <i class="fa-solid fa-gem"></i>
                            <span>ধাপ ৩</span>
                        </div>
                        <p id="step-3-text" class="text-[11px] sm:text-xs text-slate-400 mt-1">ডায়মন্ড ডেলিভারি</p>
                    </div>
                </div>

                <!-- Details Grid -->
                <div class="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-4 gap-3 text-xs text-slate-300 bg-slate-950/85 p-3.5 rounded-xl border border-slate-800/90">
                    <div>
                        <span class="text-slate-400 block text-[11px]">প্যাকেজ / আইটেম</span>
                        <strong id="status-page-item" class="text-white text-sm">উইকলি মেম্বারশিপ</strong>
                    </div>
                    <div>
                        <span class="text-slate-400 block text-[11px]">পেমেন্ট মাধ্যম</span>
                        <strong id="status-page-method" class="text-pink-400 text-sm">বিকাশ পার্সোনাল</strong>
                    </div>
                    <div>
                        <span class="text-slate-400 block text-[11px]">ট্রানজেকশন আইডি</span>
                        <strong id="status-page-trx" class="font-mono text-cyan-400 text-sm">এখনও দেওয়া হয়নি</strong>
                    </div>
                    <div>
                        <span class="text-slate-400 block text-[11px]">পার্সোনাল নম্বর</span>
                        <strong id="status-page-number" class="font-mono text-amber-400 text-sm">01863582630</strong>
                    </div>
                </div>

                <!-- Status Switcher Buttons -->
                <div class="flex flex-wrap items-center justify-between gap-3 pt-1 border-t border-slate-800/80">
                    <span class="text-[11px] text-slate-400">২ মিনিট শেষ হলে পেন্ডিং হিস্ট্রি স্থায়ীভাবে রিমুভ হবে:</span>
                    <div class="flex flex-wrap gap-2">
                        <button type="button" onclick="setPaymentStatus('pending')" class="px-3.5 py-1.5 rounded-xl text-xs font-bold bg-amber-500/20 hover:bg-amber-500/30 text-amber-300 border border-amber-500/40 transition cursor-pointer">
                            <i class="fa-solid fa-clock mr-1"></i> পেন্ডিং দেখুন
                        </button>
                        <button type="button" onclick="setPaymentStatus('successful')" class="px-3.5 py-1.5 rounded-xl text-xs font-bold bg-emerald-500/20 hover:bg-emerald-500/30 text-emerald-300 border border-emerald-500/40 transition cursor-pointer">
                            <i class="fa-solid fa-circle-check mr-1"></i> সাকসেসফুল দেখুন
                        </button>
                        <button type="button" onclick="setPaymentStatus('failed')" class="px-3.5 py-1.5 rounded-xl text-xs font-bold bg-rose-500/20 hover:bg-rose-500/30 text-rose-300 border border-rose-500/40 transition cursor-pointer">
                            <i class="fa-solid fa-circle-xmark mr-1"></i> ফেইলড দেখুন
                        </button>
                    </div>
                </div>
            </div>
        </section>

        <!-- User Orders Section (Visible when logged in) -->
        <section id="my-orders-section" class="hidden glass-card rounded-2xl p-6 space-y-4 border border-slate-800">
            <div class="flex items-center justify-between border-b border-slate-800 pb-3">
                <h3 class="text-lg font-bold text-white flex items-center gap-2">
                    <i class="fa-solid fa-clock-rotate-left text-cyan-400"></i>
                    <span>আমার অর্ডার হিস্ট্রি</span>
                </h3>
                <span id="order-count-badge" class="text-xs bg-cyan-500/20 text-cyan-300 px-2.5 py-1 rounded-full font-medium">০ টি অর্ডার</span>
            </div>
            <div id="orders-list" class="space-y-3"></div>
        </section>

    </main>

    <!-- Footer -->
    <footer class="glass-card border-t border-slate-800/80 mt-12 py-8">
        <div class="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8 flex flex-col sm:flex-row items-center justify-between gap-4 text-sm text-slate-400">
            <p>© ২০২৬ ডায়মন্ড জোন বিডি। সর্বস্বত্ব সংরক্ষিত।</p>
            <div class="flex items-center gap-2">
                <button type="button" onclick="selectCombinedMethod('bkash')" class="px-2.5 py-1 rounded bg-[#e2136e]/20 text-[#ff4d9a] font-bold text-xs border border-[#e2136e]/30 cursor-pointer">বিকাশ</button>
                <button type="button" onclick="selectCombinedMethod('nagad')" class="px-2.5 py-1 rounded bg-[#f7941d]/20 text-[#ffb347] font-bold text-xs border border-[#f7941d]/30 cursor-pointer">নগদ</button>
            </div>
        </div>
    </footer>

    <!-- ==================== MODAL 1: AUTHENTICATION ==================== -->
    <div id="auth-modal" class="fixed inset-0 z-50 hidden items-center justify-center bg-black/75 backdrop-blur-sm p-4">
        <div class="bg-slate-900 border border-slate-700/80 rounded-2xl max-w-md w-full p-6 shadow-2xl relative">
            <button onclick="closeModal('auth-modal')" class="absolute top-4 right-4 w-8 h-8 rounded-lg bg-slate-800 hover:bg-slate-700 text-slate-400 hover:text-white flex items-center justify-center transition">
                <i class="fa-solid fa-xmark"></i>
            </button>

            <div class="grid grid-cols-2 gap-2 p-1 bg-slate-950 rounded-xl mb-6 border border-slate-800">
                <button id="tab-login" onclick="switchAuthTab('login')" class="py-2.5 text-sm font-bold rounded-lg bg-cyan-600 text-white transition">
                    লগইন (Sign In)
                </button>
                <button id="tab-signup" onclick="switchAuthTab('signup')" class="py-2.5 text-sm font-bold rounded-lg text-slate-400 hover:text-white transition">
                    সাইন-আপ (Register)
                </button>
            </div>

            <form id="login-form" onsubmit="handleLogin(event)" class="space-y-4">
                <div>
                    <label class="block text-sm font-medium text-slate-300 mb-1">মোবাইল নম্বর অথবা ইমেইল</label>
                    <input type="text" id="login-identifier" required placeholder="017XXXXXXXX বা email@example.com"
                        class="w-full px-4 py-2.5 bg-slate-950 border border-slate-700 focus:border-cyan-500 rounded-xl text-white outline-none">
                </div>
                <div>
                    <label class="block text-sm font-medium text-slate-300 mb-1">পাসওয়ার্ড</label>
                    <input type="password" id="login-password" required placeholder="••••••••"
                        class="w-full px-4 py-2.5 bg-slate-950 border border-slate-700 focus:border-cyan-500 rounded-xl text-white outline-none">
                </div>
                <button type="submit" class="w-full py-3 rounded-xl bg-gradient-to-r from-cyan-500 to-blue-600 hover:from-cyan-400 hover:to-blue-500 text-white font-bold shadow-lg shadow-cyan-500/20 transition">
                    লগইন করুন
                </button>
                <p class="text-center text-xs text-slate-400">
                    অ্যাকাউন্ট নেই? <button type="button" onclick="switchAuthTab('signup')" class="text-cyan-400 hover:underline font-semibold">নতুন অ্যাকাউন্ট খুলুন</button>
                </p>
            </form>

            <form id="signup-form" onsubmit="handleSignup(event)" class="space-y-4 hidden">
                <div>
                    <label class="block text-sm font-medium text-slate-300 mb-1">আপনার পূর্ণ নাম</label>
                    <input type="text" id="signup-name" required placeholder="যেমন: তানভীর আহমেদ"
                        class="w-full px-4 py-2.5 bg-slate-950 border border-slate-700 focus:border-cyan-500 rounded-xl text-white outline-none">
                </div>
                <div>
                    <label class="block text-sm font-medium text-slate-300 mb-1">মোবাইল নম্বর অথবা ইমেইল</label>
                    <input type="text" id="signup-identifier" required placeholder="017XXXXXXXX বা email@example.com"
                        class="w-full px-4 py-2.5 bg-slate-950 border border-slate-700 focus:border-cyan-500 rounded-xl text-white outline-none">
                </div>
                <div>
                    <label class="block text-sm font-medium text-slate-300 mb-1">পাসওয়ার্ড সেট করুন</label>
                    <input type="password" id="signup-password" required minlength="4" placeholder="কমপক্ষে ৪ অক্ষরের পাসওয়ার্ড"
                        class="w-full px-4 py-2.5 bg-slate-950 border border-slate-700 focus:border-cyan-500 rounded-xl text-white outline-none">
                </div>
                <button type="submit" class="w-full py-3 rounded-xl bg-gradient-to-r from-purple-600 to-cyan-500 hover:from-purple-500 hover:to-cyan-400 text-white font-bold shadow-lg shadow-purple-500/20 transition">
                    রেজিস্ট্রেশন সম্পন্ন করুন
                </button>
                <p class="text-center text-xs text-slate-400">
                    ইতিমধ্যে অ্যাকাউন্ট আছে? <button type="button" onclick="switchAuthTab('login')" class="text-cyan-400 hover:underline font-semibold">লগইন করুন</button>
                </p>
            </form>
        </div>
    </div>

    <!-- ==================== MODAL 2: BKASH & NAGAD CHECKOUT ==================== -->
    <div id="payment-modal" class="fixed inset-0 z-50 hidden items-center justify-center bg-black/80 backdrop-blur-sm p-4 overflow-y-auto">
        <div class="bg-slate-900 border border-slate-700 rounded-2xl max-w-lg w-full p-6 shadow-2xl relative my-auto">
            <button onclick="closeModal('payment-modal')" class="absolute top-4 right-4 w-8 h-8 rounded-lg bg-slate-800 hover:bg-slate-700 text-slate-400 hover:text-white flex items-center justify-center transition">
                <i class="fa-solid fa-xmark"></i>
            </button>

            <h3 class="text-xl font-bold text-white mb-1">পেমেন্ট সম্পন্ন করুন</h3>
            <p class="text-xs text-pink-300 font-medium mb-4">বিকাশ পার্সোনাল শুধু সেন্ড মানি গ্রহণ করা হয়।</p>

            <div class="bg-slate-950 border border-slate-800 rounded-xl p-3.5 mb-5 flex items-center justify-between">
                <div>
                    <p id="checkout-item-name" class="font-bold text-white text-sm sm:text-base">উইকলি মেম্বারশিপ</p>
                    <p class="text-xs text-slate-400">Player UID: <span id="checkout-uid" class="text-cyan-400 font-mono font-bold">12345678</span></p>
                </div>
                <div class="text-right">
                    <span class="text-xs text-slate-400 block">সর্বমোট বিল</span>
                    <span id="checkout-price" class="text-xl font-bold text-amber-400">৳ ৯৫</span>
                </div>
            </div>

            <!-- Clickable Method Switcher Together -->
            <div class="grid grid-cols-2 gap-3 mb-5">
                <button type="button" id="modal-tab-bkash" onclick="selectCombinedMethod('bkash')"
                    class="p-3 rounded-xl border-2 border-[#e2136e] bg-[#e2136e]/15 flex items-center justify-center gap-2 transition cursor-pointer">
                    <span class="px-2 py-0.5 rounded bg-[#e2136e] text-white font-bold text-xs">bKash</span>
                    <span class="font-bold text-white text-sm">বিকাশ</span>
                </button>
                <button type="button" id="modal-tab-nagad" onclick="selectCombinedMethod('nagad')"
                    class="p-3 rounded-xl border-2 border-slate-700 bg-slate-950 flex items-center justify-center gap-2 transition cursor-pointer">
                    <span class="px-2 py-0.5 rounded bg-[#f7941d] text-slate-950 font-bold text-xs">Nagad</span>
                    <span class="font-bold text-white text-sm">নগদ</span>
                </button>
            </div>

            <div id="payment-instruction-box" class="rounded-xl p-4 mb-5 bg-[#e2136e]/10 border border-[#e2136e]/40 space-y-2.5">
                <div class="flex items-center justify-between">
                    <span id="modal-wallet-label" class="text-xs font-semibold text-pink-300">বিকাশ পার্সোনাল নম্বর:</span>
                    <button type="button" onclick="copyWalletNumber(activeCheckout.method)" class="text-xs bg-white/10 hover:bg-white/20 text-white px-2.5 py-1 rounded-lg flex items-center gap-1 transition cursor-pointer">
                        <i class="fa-regular fa-copy"></i> কপি করুন
                    </button>
                </div>
                <div class="flex items-center justify-between bg-slate-950/80 px-3.5 py-2.5 rounded-lg border border-white/10">
                    <span id="merchant-number" class="font-mono text-lg font-bold text-white tracking-wider">01863582630</span>
                    <span id="modal-wallet-badge" class="text-xs px-2.5 py-0.5 rounded bg-[#e2136e] text-white font-bold">বিকাশ পার্সোনাল</span>
                </div>
                <p class="text-xs text-slate-300 leading-relaxed">
                    * বিকাশ পার্সোনাল শুধু সেন্ড মানি গ্রহণ করা হয়। উপরের <strong id="modal-wallet-desc-name">বিকাশ পার্সোনাল</strong> <strong>01863582630</strong> নম্বরে <strong id="instruction-amount" class="text-amber-400">৯৫ টাকা</strong> পাঠিয়ে সঠিক <strong>Transaction ID (TrxID)</strong> দিন। ভুল TrxID দিলে <strong>ফেইলড</strong> দেখাবে।
                </p>
            </div>

            <form onsubmit="submitOrder(event)" class="space-y-4">
                <div>
                    <label id="modal-sender-label" class="block text-xs sm:text-sm font-medium text-slate-300 mb-1">আপনার বিকাশ নম্বর</label>
                    <input type="tel" id="sender-number" required pattern="01[3-9]\d{8}" placeholder="01XXXXXXXXX"
                        class="w-full px-4 py-2.5 bg-slate-950 border border-slate-700 focus:border-cyan-500 rounded-xl text-white outline-none font-mono">
                </div>
                <div>
                    <label class="block text-xs sm:text-sm font-medium text-slate-300 mb-1">ট্রানজেকশন আইডি (Transaction ID / TrxID)</label>
                    <input type="text" id="trx-id" required placeholder="যেমন: 9H7G6F5D4S (৮–১৫ অক্ষর)"
                        class="w-full px-4 py-2.5 bg-slate-950 border border-slate-700 focus:border-cyan-500 rounded-xl text-white outline-none font-mono uppercase">
                </div>
                <button type="submit" id="confirm-pay-btn" class="w-full py-3.5 rounded-xl bg-[#e2136e] hover:opacity-95 text-white font-bold text-base shadow-lg transition flex items-center justify-center gap-2 cursor-pointer">
                    <i class="fa-solid fa-circle-check"></i>
                    <span>অর্ডার কনফার্ম করুন</span>
                </button>
                <p id="modal-trx-success" class="text-center text-sm font-bold text-amber-300 hidden">পেন্ডিং</p>
            </form>
        </div>
    </div>

    <!-- JavaScript Application Logic -->
    <script>
        const regularPackages = [
            { id: 1, name: '২৫ ডায়মন্ড', price: 25, bonus: 'ইনস্ট্যান্ট' },
            { id: 2, name: '১১৫ ডায়মন্ড', price: 85, bonus: 'জনপ্রিয়' },
            { id: 3, name: '২৪০ ডায়মন্ড', price: 170, bonus: '+১০ বোনাস' },
            { id: 4, name: '৬১০ ডায়মন্ড', price: 420, bonus: '+২৫ বোনাস' },
            { id: 5, name: '১২৪০ ডায়মন্ড', price: 830, bonus: '+৫০ বোনাস' },
            { id: 6, name: 'মান্থলি মেম্বারশিপ', price: 760, bonus: '২৬০০ ডায়মন্ড' },
            { id: 7, name: 'লেভেল আপ পাস', price: 155, bonus: '৮০০ ডায়মন্ড' },
            { id: 8, name: 'ইভো এক্সেস (৭ দিন)', price: 110, bonus: 'স্পেশাল' }
        ];

        const PERSONAL_WALLET_NUMBER = '01863582630';
        const AUTO_DELETE_MS = 2 * 60 * 1000; // ২ মিনিট (১২০,০০০ মিলিসেকেন্ড)
        const STATUS_STATE_KEY = 'dz_status_card_state_v2';
        const PURGED_PENDING_IDS_KEY = 'dz_purged_pending_ids_v2';

        let currentUser = JSON.parse(localStorage.getItem('dz_current_user')) || null;
        let usersDB = JSON.parse(localStorage.getItem('dz_users_db')) || [];
        let ordersDB = JSON.parse(localStorage.getItem('dz_orders_db')) || [];
        let purgedPendingIds = JSON.parse(sessionStorage.getItem(PURGED_PENDING_IDS_KEY) || '[]');

        let activeCheckout = {
            itemName: 'উইকলি মেম্বারশিপ',
            price: 95,
            uid: '',
            method: 'bkash' // 'bkash' | 'nagad'
        };

        function savePurgedPendingIds() {
            sessionStorage.setItem(PURGED_PENDING_IDS_KEY, JSON.stringify(purgedPendingIds));
        }

        function loadInitialStatusState() {
            const saved = JSON.parse(sessionStorage.getItem(STATUS_STATE_KEY) || 'null');
            if (saved && saved.permanentlyGone) {
                return {
                    id: saved.id || 'pending-init',
                    itemName: saved.itemName || 'উইকলি মেম্বারশিপ',
                    trxId: saved.trxId || 'এখনও দেওয়া হয়নি',
                    method: saved.method || 'বিকাশ পার্সোনাল',
                    methodKey: saved.methodKey || 'bkash',
                    status: 'expired',
                    expiresAt: saved.expiresAt || 0,
                    permanentlyGone: true
                };
            }
            if (saved && saved.expiresAt && Date.now() < saved.expiresAt && saved.status !== 'expired') {
                return saved;
            }
            if (saved && saved.expiresAt && Date.now() >= saved.expiresAt) {
                if (saved.status === 'pending' && saved.id && !purgedPendingIds.includes(saved.id)) {
                    purgedPendingIds.push(saved.id);
                    savePurgedPendingIds();
                }
                const expiredState = { ...saved, status: 'expired', permanentlyGone: true };
                sessionStorage.setItem(STATUS_STATE_KEY, JSON.stringify(expiredState));
                return expiredState;
            }
            const freshId = 'PEND-' + Date.now();
            const freshState = {
                id: freshId,
                itemName: 'উইকলি মেম্বারশিপ',
                trxId: 'এখনও দেওয়া হয়নি',
                method: 'বিকাশ পার্সোনাল',
                methodKey: 'bkash',
                status: 'pending',
                expiresAt: Date.now() + AUTO_DELETE_MS,
                permanentlyGone: false
            };
            sessionStorage.setItem(STATUS_STATE_KEY, JSON.stringify(freshState));
            return freshState;
        }

        let currentPaymentPageState = loadInitialStatusState();

        function saveStatusState() {
            sessionStorage.setItem(STATUS_STATE_KEY, JSON.stringify(currentPaymentPageState));
        }

        function isValidTransactionId(trx) {
            if (!trx || typeof trx !== 'string') return false;
            const clean = trx.trim().toUpperCase();
            if (!/^[A-Z0-9]{8,15}$/.test(clean)) return false;
            if (!/[A-Z]/.test(clean) || !/[0-9]/.test(clean)) return false;
            if (/^(.)\1+$/.test(clean)) return false;

            const invalidKeywords = [
                'WRONGTRX', 'FAKE1234', 'TEST1234', 'INVALID1',
                'ABCDEFGH', '12345678', '87654321', 'QWERTY12'
            ];
            if (invalidKeywords.includes(clean)) return false;

            return true;
        }

        function getMethodLabel(methodKey) {
            return methodKey === 'nagad' ? 'নগদ পার্সোনাল' : 'বিকাশ পার্সোনাল';
        }

        function selectCombinedMethod(methodKey) {
            activeCheckout.method = methodKey;
            const isNagad = methodKey === 'nagad';
            const labelText = getMethodLabel(methodKey);

            const cardEl = document.getElementById('combined-payment-card');
            const activeTitle = document.getElementById('card-active-method-title');
            const selBkash = document.getElementById('card-select-bkash');
            const selNagad = document.getElementById('card-select-nagad');
            const walletBox = document.getElementById('card-wallet-box');
            const walletLabel = document.getElementById('card-wallet-label');
            const confirmBtn = document.getElementById('combined-confirm-btn');

            if (cardEl && activeTitle && selBkash && selNagad && walletBox && walletLabel && confirmBtn) {
                activeTitle.textContent = labelText;
                if (isNagad) {
                    activeTitle.className = 'text-orange-400';
                    cardEl.className = 'glass-card rounded-2xl p-6 max-w-2xl mx-auto border-2 border-[#f7941d]/60 space-y-5';
                    selNagad.className = 'px-4 py-2.5 rounded-xl bg-[#f7941d] text-slate-950 font-bold text-xs sm:text-sm border-2 border-white flex items-center justify-center gap-2 transition cursor-pointer';
                    selBkash.className = 'px-4 py-2.5 rounded-xl bg-[#e2136e]/80 text-white font-bold text-xs sm:text-sm border-2 border-transparent flex items-center justify-center gap-2 transition cursor-pointer';
                    walletBox.className = 'bg-slate-950/90 border border-[#f7941d]/40 rounded-xl p-4 flex items-center justify-between gap-3';
                    walletLabel.textContent = 'নগদ পার্সোনাল নম্বর';
                    walletLabel.className = 'text-xs text-orange-300 block font-semibold';
                    confirmBtn.className = 'w-full py-3.5 px-5 rounded-xl bg-[#f7941d] hover:opacity-95 text-slate-950 font-bold text-sm sm:text-base transition flex items-center justify-center gap-2 cursor-pointer';
                } else {
                    activeTitle.className = 'text-pink-400';
                    cardEl.className = 'glass-card rounded-2xl p-6 max-w-2xl mx-auto border-2 border-[#e2136e]/60 space-y-5';
                    selBkash.className = 'px-4 py-2.5 rounded-xl bg-[#e2136e] text-white font-bold text-xs sm:text-sm border-2 border-white flex items-center justify-center gap-2 transition cursor-pointer';
                    selNagad.className = 'px-4 py-2.5 rounded-xl bg-[#f7941d]/80 text-slate-950 font-bold text-xs sm:text-sm border-2 border-transparent flex items-center justify-center gap-2 transition cursor-pointer';
                    walletBox.className = 'bg-slate-950/90 border border-[#e2136e]/40 rounded-xl p-4 flex items-center justify-between gap-3';
                    walletLabel.textContent = 'বিকাশ পার্সোনাল নম্বর';
                    walletLabel.className = 'text-xs text-pink-300 block font-semibold';
                    confirmBtn.className = 'w-full py-3.5 px-5 rounded-xl bg-[#e2136e] hover:opacity-95 text-white font-bold text-sm sm:text-base transition flex items-center justify-center gap-2 cursor-pointer';
                }
            }

            const tabBkash = document.getElementById('modal-tab-bkash');
            const tabNagad = document.getElementById('modal-tab-nagad');
            const instBox = document.getElementById('payment-instruction-box');
            const mWalletLabel = document.getElementById('modal-wallet-label');
            const walletBadge = document.getElementById('modal-wallet-badge');
            const descName = document.getElementById('modal-wallet-desc-name');
            const senderLabel = document.getElementById('modal-sender-label');
            const modalConfirmBtn = document.getElementById('confirm-pay-btn');

            if (tabBkash && tabNagad && instBox && mWalletLabel && walletBadge && descName && senderLabel && modalConfirmBtn) {
                if (isNagad) {
                    tabNagad.className = 'p-3 rounded-xl border-2 border-[#f7941d] bg-[#f7941d]/15 flex items-center justify-center gap-2 transition cursor-pointer';
                    tabBkash.className = 'p-3 rounded-xl border-2 border-slate-700 bg-slate-950 flex items-center justify-center gap-2 transition cursor-pointer';
                    instBox.className = 'rounded-xl p-4 mb-5 bg-[#f7941d]/10 border border-[#f7941d]/40 space-y-2.5';
                    mWalletLabel.textContent = 'নগদ পার্সোনাল নম্বর:';
                    mWalletLabel.className = 'text-xs font-semibold text-orange-300';
                    walletBadge.textContent = 'নগদ পার্সোনাল';
                    walletBadge.className = 'text-xs px-2.5 py-0.5 rounded bg-[#f7941d] text-slate-950 font-bold';
                    descName.textContent = 'নগদ পার্সোনাল';
                    senderLabel.textContent = 'আপনার নগদ নম্বর';
                    modalConfirmBtn.className = 'w-full py-3.5 rounded-xl bg-[#f7941d] hover:opacity-95 text-slate-950 font-bold text-base shadow-lg transition flex items-center justify-center gap-2 cursor-pointer';
                } else {
                    tabBkash.className = 'p-3 rounded-xl border-2 border-[#e2136e] bg-[#e2136e]/15 flex items-center justify-center gap-2 transition cursor-pointer';
                    tabNagad.className = 'p-3 rounded-xl border-2 border-slate-700 bg-slate-950 flex items-center justify-center gap-2 transition cursor-pointer';
                    instBox.className = 'rounded-xl p-4 mb-5 bg-[#e2136e]/10 border border-[#e2136e]/40 space-y-2.5';
                    mWalletLabel.textContent = 'বিকাশ পার্সোনাল নম্বর:';
                    mWalletLabel.className = 'text-xs font-semibold text-pink-300';
                    walletBadge.textContent = 'বিকাশ পার্সোনাল';
                    walletBadge.className = 'text-xs px-2.5 py-0.5 rounded bg-[#e2136e] text-white font-bold';
                    descName.textContent = 'বিকাশ পার্সোনাল';
                    senderLabel.textContent = 'আপনার বিকাশ নম্বর';
                    modalConfirmBtn.className = 'w-full py-3.5 rounded-xl bg-[#e2136e] hover:opacity-95 text-white font-bold text-base shadow-lg transition flex items-center justify-center gap-2 cursor-pointer';
                }
            }
        }

        function pruneExpiredPendingHistory() {
            const now = Date.now();
            let ordersChanged = false;

            const remainingOrders = ordersDB.filter(order => {
                if (purgedPendingIds.includes(order.orderId)) {
                    ordersChanged = true;
                    return false;
                }
                const exp = order.expiresAt || ((order.createdAt || now) + AUTO_DELETE_MS);
                if (order.status === 'পেন্ডিং' && now >= exp) {
                    purgedPendingIds.push(order.orderId);
                    savePurgedPendingIds();
                    ordersChanged = true;
                    return false;
                }
                return true;
            });

            if (ordersChanged) {
                ordersDB = remainingOrders;
                localStorage.setItem('dz_orders_db', JSON.stringify(ordersDB));
                renderOrders();
            }

            if (
                !currentPaymentPageState.permanentlyGone &&
                currentPaymentPageState.status === 'pending' &&
                now >= currentPaymentPageState.expiresAt
            ) {
                if (currentPaymentPageState.id && !purgedPendingIds.includes(currentPaymentPageState.id)) {
                    purgedPendingIds.push(currentPaymentPageState.id);
                    savePurgedPendingIds();
                }
                expireStatusPermanently();
            }
        }

        function formatCountdown(msRemaining) {
            const totalSec = Math.max(0, Math.ceil(msRemaining / 1000));
            const mins = String(Math.floor(totalSec / 60)).padStart(2, '0');
            const secs = String(totalSec % 60).padStart(2, '0');
            return `${toBanglaDigits(mins)}:${toBanglaDigits(secs)} বাকি`;
        }

        function toBanglaDigits(str) {
            const map = { '0': '০', '1': '১', '2': '২', '3': '৩', '4': '৪', '5': '৫', '6': '৬', '7': '৭', '8': '৮', '9': '৯' };
            return String(str).replace(/[0-9]/g, d => map[d]);
        }

        function expireStatusPermanently() {
            currentPaymentPageState.status = 'expired';
            currentPaymentPageState.permanentlyGone = true;
            saveStatusState();

            const statusSection = document.getElementById('payment-status-page');
            if (statusSection) {
                statusSection.remove();
            }

            const cardStatus = document.getElementById('combined-card-status');
            if (cardStatus) {
                cardStatus.textContent = '';
                cardStatus.classList.add('hidden');
            }

            const modalStatus = document.getElementById('modal-trx-success');
            if (modalStatus) {
                modalStatus.textContent = '';
                modalStatus.classList.add('hidden');
            }
        }

        window.onload = () => {
            renderPackages();
            updateAuthUI();
            pruneExpiredPendingHistory();
            renderOrders();
            selectCombinedMethod('bkash');
            updatePaymentStatusPage();

            setInterval(() => {
                pruneExpiredPendingHistory();

                if (!currentPaymentPageState.permanentlyGone && currentPaymentPageState.status !== 'expired') {
                    const remaining = currentPaymentPageState.expiresAt - Date.now();
                    const timerEl = document.getElementById('status-auto-timer');
                    if (timerEl) {
                        timerEl.textContent = formatCountdown(remaining);
                    }
                    if (remaining <= 0) {
                        expireStatusPermanently();
                    }
                }
            }, 1000);
        };

        function copyWalletNumber(methodKey) {
            if (navigator.clipboard && navigator.clipboard.writeText) {
                navigator.clipboard.writeText(PERSONAL_WALLET_NUMBER);
            }
            showToast(`${getMethodLabel(methodKey)} নম্বর কপি হয়েছে: ${PERSONAL_WALLET_NUMBER}`, 'success');
        }

        function recordPaymentAttempt({ trx, methodKey, senderNumber = PERSONAL_WALLET_NUMBER }) {
            const validTrx = isValidTransactionId(trx);
            const statusText = validTrx ? 'পেন্ডিং' : 'ফেইলড';
            const statusKey = validTrx ? 'pending' : 'failed';
            const methodLabel = getMethodLabel(methodKey);
            const now = Date.now();
            const expiresAt = now + AUTO_DELETE_MS;
            const recordId = 'ORD-' + Math.floor(100000 + Math.random() * 900000);

            if (validTrx && !purgedPendingIds.includes(recordId) && currentUser) {
                const uidVal = document.getElementById('player-uid-input').value.trim() || 'N/A';
                const newOrder = {
                    orderId: recordId,
                    userId: currentUser.id,
                    itemName: activeCheckout.itemName,
                    price: activeCheckout.price,
                    uid: uidVal,
                    method: methodLabel,
                    walletNumber: PERSONAL_WALLET_NUMBER,
                    sender: senderNumber,
                    trxId: trx,
                    status: 'পেন্ডিং',
                    createdAt: now,
                    expiresAt,
                    date: new Date(now).toLocaleTimeString('bn-BD', { hour: '2-digit', minute: '2-digit' })
                };
                ordersDB.unshift(newOrder);
                localStorage.setItem('dz_orders_db', JSON.stringify(ordersDB));
                renderOrders();
            }

            if (!currentPaymentPageState.permanentlyGone) {
                currentPaymentPageState = {
                    id: recordId,
                    itemName: activeCheckout.itemName,
                    trxId: trx || 'ভুল / খালি TrxID',
                    method: methodLabel,
                    methodKey,
                    status: statusKey,
                    expiresAt,
                    permanentlyGone: currentPaymentPageState.permanentlyGone
                };
                saveStatusState();
                updatePaymentStatusPage();
            }

            return { validTrx, statusText, statusKey, methodLabel, expiresAt };
        }

        function confirmCombinedPayment() {
            const input = document.getElementById('combined-trx-input');
            const statusEl = document.getElementById('combined-card-status');
            const trx = input.value.trim().toUpperCase();
            const methodKey = activeCheckout.method || 'bkash';

            const result = recordPaymentAttempt({ trx, methodKey });

            statusEl.classList.remove('hidden');
            if (result.validTrx) {
                statusEl.textContent = `${result.methodLabel}: পেন্ডিং (২ মিনিট পর হিস্ট্রি থেকে স্থায়ীভাবে মুছে যাবে)`;
                statusEl.className = 'text-sm font-bold text-amber-300 pt-1';
                showToast(`${result.methodLabel} পেন্ডিং — ২ মিনিট পর আর দেখাবে না`, 'warning');
            } else {
                statusEl.textContent = `${result.methodLabel}: ফেইলড — ভুল ট্রানজেকশন আইডি দিয়েছেন`;
                statusEl.className = 'text-sm font-bold text-rose-400 pt-1';
                showToast('ভুল ট্রানজেকশন আইডি! পেমেন্ট ফেইলড দেখাচ্ছে।', 'error');
            }

            scrollToPaymentStatusPage();

            if (result.validTrx) {
                setTimeout(() => {
                    if (statusEl) {
                        statusEl.textContent = '';
                        statusEl.classList.add('hidden');
                    }
                }, AUTO_DELETE_MS);
            }
        }

        function updatePaymentStatusPage() {
            const sectionEl = document.getElementById('payment-status-page');
            if (!sectionEl) return;

            if (currentPaymentPageState.permanentlyGone || currentPaymentPageState.status === 'expired' || Date.now() >= currentPaymentPageState.expiresAt) {
                expireStatusPermanently();
                return;
            }

            sectionEl.classList.remove('hidden');

            const iconBox = document.getElementById('status-icon-box');
            const pageBadge = document.getElementById('status-page-badge');
            const timerEl = document.getElementById('status-auto-timer');
            const titleEl = document.getElementById('status-page-success-title');
            const pillEl = document.getElementById('status-page-state-pill');
            const descEl = document.getElementById('status-page-desc');
            const itemEl = document.getElementById('status-page-item');
            const trxEl = document.getElementById('status-page-trx');
            const methodEl = document.getElementById('status-page-method');
            const numEl = document.getElementById('status-page-number');
            const step2Box = document.getElementById('step-2-box');
            const step2Text = document.getElementById('step-2-text');
            const step3Box = document.getElementById('step-3-box');
            const step3Text = document.getElementById('step-3-text');

            timerEl.textContent = formatCountdown(currentPaymentPageState.expiresAt - Date.now());
            itemEl.textContent = currentPaymentPageState.itemName || 'ডায়মন্ড টপ-আপ';
            trxEl.textContent = currentPaymentPageState.trxId;
            methodEl.textContent = currentPaymentPageState.method;
            methodEl.className = currentPaymentPageState.methodKey === 'nagad' ? 'text-orange-400 text-sm font-bold' : 'text-pink-400 text-sm font-bold';
            numEl.textContent = PERSONAL_WALLET_NUMBER;

            if (currentPaymentPageState.status === 'failed') {
                sectionEl.className = 'glass-card rounded-3xl p-6 sm:p-7 space-y-5 border border-rose-500/45';
                iconBox.className = 'w-12 h-12 rounded-2xl bg-rose-500/15 border border-rose-500/40 flex items-center justify-center text-rose-400 text-xl shrink-0';
                iconBox.innerHTML = '<i class="fa-solid fa-circle-xmark"></i>';

                pageBadge.className = 'inline-flex items-center gap-2 px-3.5 py-1.5 rounded-full text-xs sm:text-sm font-bold bg-rose-500/20 text-rose-300 border border-rose-500/45';
                pageBadge.innerHTML = '<i class="fa-solid fa-circle-xmark"></i> ফেইলড';

                titleEl.textContent = 'ফেইলড — ভুল ট্রানজেকশন আইডি শনাক্ত হয়েছে';
                titleEl.className = 'text-lg sm:text-xl font-bold text-rose-400 block';

                pillEl.textContent = 'পেমেন্ট ফেইলড';
                pillEl.className = 'self-start md:self-center text-xs font-bold px-3.5 py-1.5 rounded-xl bg-rose-500/20 text-rose-300 border border-rose-500/45 shrink-0';

                descEl.innerHTML = `বিকাশ পার্সোনাল শুধু সেন্ড মানি গ্রহণ করা হয়। ভুল ট্রানজেকশন আইডি (<strong class="text-rose-300 font-mono">${currentPaymentPageState.trxId}</strong>) দেওয়ায় পেমেন্টটি <strong class="text-rose-400">ফেইলড</strong> হয়েছে।`;

                step2Box.className = 'rounded-xl p-3 bg-rose-500/15 border border-rose-500/40';
                step2Text.textContent = 'পেমেন্ট ফেইলড (ভুল TrxID)';
                step2Text.className = 'text-[11px] sm:text-xs text-rose-300 mt-1 font-bold';

                step3Box.className = 'rounded-xl p-3 bg-slate-900/80 border border-slate-800';
                step3Text.textContent = 'ডেলিভারি বাতিল';
                step3Text.className = 'text-[11px] sm:text-xs text-rose-300/80 mt-1';
            } else if (currentPaymentPageState.status === 'successful') {
                sectionEl.className = 'glass-card rounded-3xl p-6 sm:p-7 space-y-5 border border-emerald-500/35';
                iconBox.className = 'w-12 h-12 rounded-2xl bg-emerald-500/15 border border-emerald-500/35 flex items-center justify-center text-emerald-400 text-xl shrink-0';
                iconBox.innerHTML = '<i class="fa-solid fa-circle-check"></i>';

                pageBadge.className = 'inline-flex items-center gap-2 px-3.5 py-1.5 rounded-full text-xs sm:text-sm font-bold bg-emerald-500/20 text-emerald-300 border border-emerald-500/40';
                pageBadge.innerHTML = '<i class="fa-solid fa-circle-check"></i> সাকসেসফুল';

                titleEl.textContent = 'সাকসেসফুল — আপনার পেমেন্ট ও অর্ডার সম্পন্ন হয়েছে';
                titleEl.className = 'text-lg sm:text-xl font-bold text-emerald-400 block';

                pillEl.textContent = 'পেমেন্ট সাকসেসফুল';
                pillEl.className = 'self-start md:self-center text-xs font-bold px-3.5 py-1.5 rounded-xl bg-emerald-500/20 text-emerald-300 border border-emerald-500/40 shrink-0';

                descEl.innerHTML = `বিকাশ পার্সোনাল শুধু সেন্ড মানি গ্রহণ করা হয়। ${currentPaymentPageState.method} (<strong class="text-cyan-400 font-mono">01863582630</strong>) পেমেন্ট যাচাই সম্পন্ন হয়েছে এবং অর্ডারটি <strong class="text-emerald-400">সাকসেসফুল</strong> অবস্থায় রয়েছে।`;

                step2Box.className = 'rounded-xl p-3 bg-emerald-500/10 border border-emerald-500/30';
                step2Text.textContent = 'পেমেন্ট যাচাই সম্পন্ন';
                step2Text.className = 'text-[11px] sm:text-xs text-emerald-200 mt-1 font-medium';

                step3Box.className = 'rounded-xl p-3 bg-emerald-500/15 border border-emerald-500/40';
                step3Text.textContent = 'অর্ডার সাকসেসফুল';
                step3Text.className = 'text-[11px] sm:text-xs text-emerald-300 mt-1 font-bold';
            } else {
                sectionEl.className = 'glass-card rounded-3xl p-6 sm:p-7 space-y-5 border border-amber-500/35 pending-pulse';
                iconBox.className = 'w-12 h-12 rounded-2xl bg-amber-500/15 border border-amber-500/35 flex items-center justify-center text-amber-400 text-xl shrink-0';
                iconBox.innerHTML = '<i class="fa-solid fa-hourglass-half fa-spin" style="--fa-animation-duration: 3s;"></i>';

                pageBadge.className = 'inline-flex items-center gap-2 px-3.5 py-1.5 rounded-full text-xs sm:text-sm font-bold bg-amber-500/20 text-amber-300 border border-amber-500/40';
                pageBadge.innerHTML = '<i class="fa-solid fa-clock"></i> পেন্ডিং';

                titleEl.textContent = 'পেন্ডিং — আপনার পেমেন্ট যাচাইয়ের অপেক্ষায় আছে';
                titleEl.className = 'text-lg sm:text-xl font-bold text-amber-300 block';

                pillEl.textContent = 'অর্ডার পেন্ডিং';
                pillEl.className = 'self-start md:self-center text-xs font-bold px-3.5 py-1.5 rounded-xl bg-amber-500/20 text-amber-300 border border-amber-500/40 shrink-0';

                descEl.innerHTML = `বিকাশ পার্সোনাল শুধু সেন্ড মানি গ্রহণ করা হয়। ${currentPaymentPageState.method} নম্বর <strong class="text-cyan-400 font-mono">01863582630</strong>-এ টাকা পাঠানোর পর অর্ডারটি বর্তমানে <strong class="text-amber-300">পেন্ডিং</strong> অবস্থায় আছে। ২ মিনিট পর এই পেন্ডিং হিস্ট্রি স্থায়ীভাবে মুছে যাবে এবং দ্বিতীয়বার আর দেখাবে না।`;

                step2Box.className = 'rounded-xl p-3 bg-amber-500/15 border border-amber-500/40';
                step2Text.textContent = 'পেমেন্ট পেন্ডিং (যাচাই চলছে)';
                step2Text.className = 'text-[11px] sm:text-xs text-amber-200 mt-1 font-medium';

                step3Box.className = 'rounded-xl p-3 bg-slate-900/80 border border-slate-800';
                step3Text.textContent = 'ডায়মন্ড ডেলিভারি (অপেক্ষমাণ)';
                step3Text.className = 'text-[11px] sm:text-xs text-slate-400 mt-1';
            }
        }

        function setPaymentStatus(status) {
            if (currentPaymentPageState.permanentlyGone) return;
            currentPaymentPageState.status = status;
            saveStatusState();
            updatePaymentStatusPage();

            const toastMap = {
                successful: ['স্ট্যাটাস: সাকসেসফুল', 'success'],
                failed: ['স্ট্যাটাস: ফেইলড', 'error'],
                pending: ['স্ট্যাটাস: পেন্ডিং (২ মিনিট পর হিস্ট্রি মুছে যাবে)', 'warning']
            };
            const [msg, type] = toastMap[status] || toastMap.pending;
            showToast(msg, type);
        }

        function scrollToPaymentStatusPage() {
            const el = document.getElementById('payment-status-page');
            if (el && !el.classList.contains('hidden')) {
                el.scrollIntoView({ behavior: 'smooth' });
            }
        }

        function showToast(message, type = 'info') {
            const container = document.getElementById('toast-container');
            const toast = document.createElement('div');
            
            const colors = {
                success: 'bg-emerald-950/95 border-emerald-500 text-emerald-200',
                error: 'bg-rose-950/95 border-rose-500 text-rose-200',
                warning: 'bg-amber-950/95 border-amber-500 text-amber-200',
                info: 'bg-slate-900/95 border-cyan-500 text-cyan-200'
            };

            const icons = {
                success: 'fa-circle-check text-emerald-400',
                error: 'fa-circle-exclamation text-rose-400',
                warning: 'fa-triangle-exclamation text-amber-400',
                info: 'fa-circle-info text-cyan-400'
            };

            toast.className = `pointer-events-auto flex items-center gap-3 px-4 py-3.5 rounded-xl border shadow-xl backdrop-blur-md transition-all duration-300 transform translate-x-0 ${colors[type]}`;
            toast.innerHTML = `
                <i class="fa-solid ${icons[type]} text-lg"></i>
                <p class="text-sm font-medium leading-snug">${message}</p>
            `;

            container.appendChild(toast);

            setTimeout(() => {
                toast.style.opacity = '0';
                toast.style.transform = 'translateX(20px)';
                setTimeout(() => toast.remove(), 300);
            }, 3500);
        }

        function renderPackages() {
            const grid = document.getElementById('packages-grid');
            grid.innerHTML = regularPackages.map(pkg => `
                <div onclick="initiatePurchase('${pkg.name}', ${pkg.price}, false)" 
                    class="glass-card hover:border-cyan-500/60 rounded-xl p-4 cursor-pointer transition-all hover:-translate-y-1 group relative overflow-hidden">
                    <span class="text-[10px] font-semibold px-2 py-0.5 rounded bg-cyan-500/15 text-cyan-300 border border-cyan-500/20">
                        ${pkg.bonus}
                    </span>
                    <div class="my-3 flex items-center gap-2.5">
                        <div class="w-9 h-9 rounded-lg bg-cyan-500/10 flex items-center justify-center text-cyan-400 group-hover:scale-110 transition">
                            <i class="fa-solid fa-gem"></i>
                        </div>
                        <h4 class="font-bold text-white text-sm sm:text-base">${pkg.name}</h4>
                    </div>
                    <div class="flex items-center justify-between pt-2 border-t border-slate-800/80">
                        <span class="text-lg font-bold text-amber-400">৳ ${pkg.price}</span>
                        <span class="text-xs text-slate-400 group-hover:text-cyan-400 transition">কিনুন <i class="fa-solid fa-arrow-right ml-0.5"></i></span>
                    </div>
                </div>
            `).join('');
        }

        function updateAuthUI() {
            const navArea = document.getElementById('nav-auth-area');
            const lockNote = document.getElementById('membership-lock-note');
            const ordersSection = document.getElementById('my-orders-section');

            if (currentUser) {
                navArea.innerHTML = `
                    <div class="flex items-center gap-2 sm:gap-3">
                        <div class="hidden sm:flex items-center gap-2 bg-slate-800/90 border border-slate-700 px-3 py-1.5 rounded-xl">
                            <div class="w-6 h-6 rounded-full bg-gradient-to-r from-cyan-500 to-purple-500 flex items-center justify-center text-xs font-bold text-white">
                                ${currentUser.name.charAt(0).toUpperCase()}
                            </div>
                            <span class="text-sm font-medium text-slate-200">${currentUser.name}</span>
                        </div>
                        <button onclick="scrollToOrders()" class="px-3 py-2 rounded-xl bg-slate-800 hover:bg-slate-700 text-cyan-400 text-xs sm:text-sm font-semibold border border-slate-700 transition">
                            <i class="fa-solid fa-receipt sm:mr-1"></i> <span class="hidden sm:inline">অর্ডার</span>
                        </button>
                        <button onclick="handleLogout()" class="px-3 py-2 rounded-xl bg-rose-500/15 hover:bg-rose-500/25 text-rose-400 border border-rose-500/30 text-xs sm:text-sm font-semibold transition">
                            <i class="fa-solid fa-right-from-bracket"></i> <span class="hidden sm:inline">লগআউট</span>
                        </button>
                    </div>
                `;
                lockNote.innerHTML = `<i class="fa-solid fa-circle-check text-emerald-400 mr-1"></i> স্বাগতম ${currentUser.name}! আপনি মেম্বারশিপ নেওয়ার জন্য উপযুক্ত।`;
                lockNote.className = 'text-center text-xs text-emerald-400 mt-2.5';
                ordersSection.classList.remove('hidden');
            } else {
                navArea.innerHTML = `
                    <button onclick="openAuthModal('login')" class="px-3.5 py-2 rounded-xl bg-slate-800 hover:bg-slate-700 text-white text-xs sm:text-sm font-semibold border border-slate-700 transition">
                        লগইন
                    </button>
                    <button onclick="openAuthModal('signup')" class="px-3.5 py-2 rounded-xl bg-gradient-to-r from-cyan-500 to-purple-600 hover:opacity-95 text-white text-xs sm:text-sm font-bold shadow-md shadow-cyan-500/20 transition">
                        সাইন-আপ
                    </button>
                `;
                lockNote.innerHTML = `<i class="fa-solid fa-lock mr-1"></i> মেম্বারশিপ নিতে লগইন বা সাইন-আপ আবশ্যক`;
                lockNote.className = 'text-center text-xs text-amber-300/80 mt-2.5';
                ordersSection.classList.add('hidden');
            }
        }

        function openAuthModal(tab = 'login') {
            switchAuthTab(tab);
            const modal = document.getElementById('auth-modal');
            modal.classList.remove('hidden');
            modal.classList.add('flex');
        }

        function closeModal(modalId) {
            const modal = document.getElementById(modalId);
            modal.classList.add('hidden');
            modal.classList.remove('flex');
        }

        function switchAuthTab(tab) {
            const loginForm = document.getElementById('login-form');
            const signupForm = document.getElementById('signup-form');
            const tabLogin = document.getElementById('tab-login');
            const tabSignup = document.getElementById('tab-signup');

            if (tab === 'login') {
                loginForm.classList.remove('hidden');
                signupForm.classList.add('hidden');
                tabLogin.className = 'py-2.5 text-sm font-bold rounded-lg bg-cyan-600 text-white transition';
                tabSignup.className = 'py-2.5 text-sm font-bold rounded-lg text-slate-400 hover:text-white transition';
            } else {
                signupForm.classList.remove('hidden');
                loginForm.classList.add('hidden');
                tabSignup.className = 'py-2.5 text-sm font-bold rounded-lg bg-purple-600 text-white transition';
                tabLogin.className = 'py-2.5 text-sm font-bold rounded-lg text-slate-400 hover:text-white transition';
            }
        }

        function handleSignup(e) {
            e.preventDefault();
            const name = document.getElementById('signup-name').value.trim();
            const identifier = document.getElementById('signup-identifier').value.trim();
            const password = document.getElementById('signup-password').value;

            if (usersDB.some(u => u.identifier === identifier)) {
                showToast('এই নম্বর বা ইমেইল দিয়ে ইতিমধ্যে অ্যাকাউন্ট খোলা হয়েছে!', 'error');
                return;
            }

            const newUser = { id: Date.now(), name, identifier, password };
            usersDB.push(newUser);
            localStorage.setItem('dz_users_db', JSON.stringify(usersDB));

            currentUser = newUser;
            localStorage.setItem('dz_current_user', JSON.stringify(currentUser));

            closeModal('auth-modal');
            updateAuthUI();
            renderOrders();
            showToast(`অভিনন্দন ${name}! আপনার রেজিস্ট্রেশন সফল হয়েছে।`, 'success');
        }

        function handleLogin(e) {
            e.preventDefault();
            const identifier = document.getElementById('login-identifier').value.trim();
            const password = document.getElementById('login-password').value;

            const user = usersDB.find(u => u.identifier === identifier && u.password === password);
            if (!user) {
                showToast('ভুল নম্বর/ইমেইল অথবা পাসওয়ার্ড দিয়েছেন! নতুন হলে সাইন-আপ করুন।', 'error');
                return;
            }

            currentUser = user;
            localStorage.setItem('dz_current_user', JSON.stringify(currentUser));

            closeModal('auth-modal');
            updateAuthUI();
            renderOrders();
            showToast(`স্বাগতম ${user.name}! লগইন সফল হয়েছে।`, 'success');
        }

        function handleLogout() {
            currentUser = null;
            localStorage.removeItem('dz_current_user');
            updateAuthUI();
            showToast('আপনি সফলভাবে লগআউট করেছেন।', 'info');
        }

        function initiatePurchase(itemName, price, requiresMembershipAuth) {
            if (!currentUser) {
                showToast('৯৫ টাকার উইকলি মেম্বারশিপ বা টপ-আপ নিতে প্রথমে লগইন বা সাইন-আপ করুন!', 'warning');
                openAuthModal('signup');
                return;
            }

            const uidInput = document.getElementById('player-uid-input');
            const uid = uidInput.value.trim();
            if (!uid || uid.length < 4) {
                showToast('অনুগ্রহ করে উপরে আপনার সঠিক Player UID দিন!', 'warning');
                uidInput.focus();
                uidInput.classList.add('border-amber-500');
                setTimeout(() => uidInput.classList.remove('border-amber-500'), 2000);
                return;
            }

            activeCheckout = { itemName, price, uid, method: activeCheckout.method || 'bkash' };
            
            document.getElementById('checkout-item-name').textContent = itemName;
            document.getElementById('checkout-uid').textContent = uid;
            document.getElementById('checkout-price').textContent = `৳ ${price}`;
            document.getElementById('instruction-amount').textContent = `${price} টাকা`;
            document.getElementById('modal-trx-success').classList.add('hidden');
            selectCombinedMethod(activeCheckout.method);

            const modal = document.getElementById('payment-modal');
            modal.classList.remove('hidden');
            modal.classList.add('flex');
        }

        function submitOrder(e) {
            e.preventDefault();
            const sender = document.getElementById('sender-number').value.trim();
            const trxId = document.getElementById('trx-id').value.trim().toUpperCase();
            const successEl = document.getElementById('modal-trx-success');

            const result = recordPaymentAttempt({
                trx: trxId,
                methodKey: activeCheckout.method,
                senderNumber: sender
            });

            successEl.classList.remove('hidden');
            if (result.validTrx) {
                successEl.textContent = 'পেন্ডিং';
                successEl.className = 'text-center text-sm font-bold text-amber-300';
                document.getElementById('sender-number').value = '';
                document.getElementById('trx-id').value = '';
                closeModal('payment-modal');
                scrollToPaymentStatusPage();
                showToast(`${result.methodLabel} পেন্ডিং — ২ মিনিট পর হিস্ট্রি থেকে সরে যাবে`, 'warning');
            } else {
                successEl.textContent = 'ফেইলড — ভুল ট্রানজেকশন আইডি দিয়েছেন!';
                successEl.className = 'text-center text-sm font-bold text-rose-400';
                showToast('ভুল ট্রানজেকশন আইডি! পেমেন্ট ফেইলড দেখাচ্ছে।', 'error');
            }
        }

        function renderOrders() {
            if (!currentUser) return;
            pruneExpiredPendingHistory();
            const userOrders = ordersDB.filter(o => o.userId === currentUser.id && o.status !== 'পেন্ডিং');
            const list = document.getElementById('orders-list');
            const badge = document.getElementById('order-count-badge');

            badge.textContent = `${userOrders.length} টি অর্ডার`;

            if (userOrders.length === 0) {
                list.innerHTML = `<p class="text-center text-sm text-slate-500 py-4">কোনো অর্ডার হিস্ট্রি নেই।</p>`;
                return;
            }

            list.innerHTML = userOrders.map(order => {
                let badgeClass = 'bg-emerald-500/15 text-emerald-300 border-emerald-500/30';
                let iconClass = 'fa-circle-check';

                if (order.status === 'ফেইলড') {
                    badgeClass = 'bg-rose-500/15 text-rose-300 border-rose-500/35';
                    iconClass = 'fa-circle-xmark';
                }

                return `
                <div class="bg-slate-900/90 border border-slate-800 rounded-xl p-4 flex flex-col sm:flex-row sm:items-center justify-between gap-3">
                    <div class="space-y-1">
                        <div class="flex items-center gap-2">
                            <span class="text-xs font-mono text-slate-400">#${order.orderId}</span>
                            <span class="text-xs px-2.5 py-0.5 rounded-full ${badgeClass} border font-semibold">
                                <i class="fa-solid ${iconClass} mr-1 text-[10px]"></i> ${order.status}
                            </span>
                        </div>
                        <h4 class="font-bold text-white">${order.itemName}</h4>
                        <p class="text-xs text-slate-400">
                            UID: <span class="text-cyan-400 font-mono">${order.uid}</span> • ${order.method}: <span class="text-amber-300 font-mono">${PERSONAL_WALLET_NUMBER}</span> • TrxID: <span class="font-mono text-slate-200">${order.trxId}</span>
                        </p>
                    </div>
                    <div class="sm:text-right flex sm:flex-col items-center sm:items-end justify-between border-t sm:border-t-0 border-slate-800 pt-2 sm:pt-0">
                        <span class="text-lg font-bold text-amber-400">৳ ${order.price}</span>
                        <span class="text-[11px] text-slate-500">সময়: ${order.date}</span>
                    </div>
                </div>
            `;
            }).join('');
        }

        function scrollToOrders() {
            const sec = document.getElementById('my-orders-section');
            sec.scrollIntoView({ behavior: 'smooth' });
        }
    </script>
</body>
</html>